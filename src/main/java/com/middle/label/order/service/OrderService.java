package com.middle.label.order.service;

import com.github.pagehelper.PageInfo;
import com.middle.label.order.entity.dto.GetOrderListPageDTO;
import com.middle.label.order.entity.dto.OrderBoxInfoDTO;
import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.entity.po.UrValueFkTask;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * (UrValueFk)表服务接口
 *
 * @author 文亮
 * @since 2024-04-07 23:13:06
 */
@Validated
public interface OrderService {
    /**
     * 修改数据
     *
     * @param urValueFk 实例对象
     * @return 成功为1，失败为0
     */
    Integer dealAfterPrint(UrValueFk urValueFk);

    /**
     * 获取机台任务列表
     * @return
     */
    List<UrValueFkTask> getMachineList();

    /**
     * 查询按照箱编号正序排序的第一个订单信息
     * @return
     */
    UrValueFk getOrderBoxInfo(OrderBoxInfoDTO orderBoxInfoDTO);

    /**
     * 查询已经完成打印的订单信息
     * @param getOrderListPageDTO
     * @return
     */
    PageInfo<UrValueFk> getOrderListSearch(GetOrderListPageDTO getOrderListPageDTO);

    /**
     * 更新
     * @param  urValueFk
     */
    Integer update(UrValueFk urValueFk);
}
