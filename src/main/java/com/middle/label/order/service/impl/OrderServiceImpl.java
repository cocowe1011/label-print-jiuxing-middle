package com.middle.label.order.service.impl;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.middle.label.order.dao.UrValueFkLogMapper;
import com.middle.label.order.dao.UrValueFkTaskMapper;
import com.middle.label.order.entity.dto.GetMachineTaskDTO;
import com.middle.label.order.entity.dto.GetOrderListPageDTO;
import com.middle.label.order.entity.dto.OrderBoxInfoDTO;
import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.dao.UrValueFkMapper;
import com.middle.label.order.entity.po.UrValueFkLog;
import com.middle.label.order.entity.po.UrValueFkTask;
import com.middle.label.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;

/**
 * (UrValueFk)表服务实现类
 *
 * @author 文亮
 * @since 2024-04-07 23:13:06
 */
@Service("urValueFkService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private UrValueFkMapper urValueFkMapper;

    @Resource
    private UrValueFkTaskMapper urValueFkTaskMapper;

    @Resource
    private UrValueFkLogMapper urValueFkLogMapper;

    /**
     * 获取机台任务列表
     * @return
     */
    @Override
    @DS("db2")
    public List<UrValueFkTask> getMachineTask(GetMachineTaskDTO getMachineTaskDTO) {
        return this.urValueFkTaskMapper.getMachineTask(getMachineTaskDTO);
    }

    /**
     * 查询按照箱编号正序排序的第一个订单信息
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    @DS("db2")
    public UrValueFk getOrderBoxInfo(OrderBoxInfoDTO orderBoxInfoDTO) {
        // 加悲观锁，保证数据操作原子性
        UrValueFk urValueFk = this.urValueFkMapper.getOrderBoxInfoForUpdate(orderBoxInfoDTO);
        if (null != urValueFk) {
            UrValueFk entity = new UrValueFk();
            entity.setId(urValueFk.getId());
            entity.setIsComplete(20);
            entity.setMachine(orderBoxInfoDTO.getMachine());
            this.urValueFkMapper.updateById(entity);
        }
        return urValueFk;
    }

    /**
     * 修改数据
     *
     * @param urValueFk 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    @DS("db2")
    public Integer dealAfterPrint(UrValueFk urValueFk) {
        // 1、更新订单任务表中的一些字段
        UrValueFk entity = new UrValueFk();
        entity.setId(urValueFk.getId());
        entity.setIsComplete(10);
        entity.setIsgather(1);
        entity.setMachine(urValueFk.getMachine());
        entity.setNweight(urValueFk.getNweight());
        entity.setQrCode(urValueFk.getQrCode());
        entity.setInspection(urValueFk.getInspection());
        entity.setIboxtag(urValueFk.getIboxtag());
        entity.setCclass(urValueFk.getCclass());
        entity.setCremark(urValueFk.getCremark());
        entity.setNamount(urValueFk.getNamount());
        int i = this.urValueFkMapper.updateById(entity);
        if(i < 1) {
            throw new RuntimeException();
        }
        // 2、插入日志表
        UrValueFkLog urValueFkLog = new UrValueFkLog();
        // 赋值
        urValueFkLog.setDstatuschange(new Date());
        urValueFkLog.setIdScproduct(urValueFk.getIdScproduct());
        urValueFkLog.setIdRequest(urValueFk.getIdRequest());
        urValueFkLog.setCcodeScproduct(urValueFk.getCcodeScproduct());
        urValueFkLog.setCcodeOnly(urValueFk.getIdScproduct() + "_" + urValueFk.getIdRequest());
        urValueFkLog.setMachine(urValueFk.getMachine());
        urValueFkLog.setTeam(urValueFk.getTeam());
        urValueFkLog.setOperator(urValueFk.getOperator());
        /**
         * OperationType
         * 0：修改
         * 1：删除
         * 2：新增
         * 3：补打印
         */
        urValueFkLog.setOperationType("2");
        urValueFkLog.setRemarks("打印标签成功后插入日志记录表");
        i = urValueFkLogMapper.insert(urValueFkLog);
        if(i < 1) {
            throw new RuntimeException();
        }
        // 3、考虑如果更新失败了，怎么办--回滚啦
        return i;
    }

    /**
     * 查询已经完成打印的订单信息
     * @param getOrderListPageDTO
     * @return
     */
    @Override
    @DS("db2")
    public PageInfo<UrValueFk> getOrderListSearch(GetOrderListPageDTO getOrderListPageDTO) {
        // 分页查询当前时段的预约患者
        Page<UrValueFk> page = startPage(getOrderListPageDTO.getPageNum(), getOrderListPageDTO.getPageSize());
        urValueFkMapper.getOrderListSearch(getOrderListPageDTO);
        PageInfo<UrValueFk> voPage = new PageInfo<>(page);
        return voPage;
    }

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    @DS("db2")
    public Integer update(UrValueFk entity) {
        return this.urValueFkMapper.updateById(entity);
    }
}
