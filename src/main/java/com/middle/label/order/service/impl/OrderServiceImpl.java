package com.middle.label.order.service.impl;
import com.middle.label.order.dao.UrValueFkTaskMapper;
import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.dao.UrValueFkMapper;
import com.middle.label.order.entity.po.UrValueFkTask;
import com.middle.label.order.service.OrderService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 获取机台任务列表
     * @return
     */
    @Override
    public List<UrValueFkTask> getMachineList() {
        return this.urValueFkTaskMapper.getMachineList();
    }

    /**
     * 查询按照箱编号正序排序的第一个订单信息
     * @return
     */
    @Override
    public UrValueFk getOrderBoxInfo() {
        return this.urValueFkMapper.getOrderBoxInfo();
    }

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public int update(UrValueFk entity) {
        //1.将新增页面中的信息转换为po对象
        int update = this.urValueFkMapper.updateById(entity);
        return update;
    }
}
