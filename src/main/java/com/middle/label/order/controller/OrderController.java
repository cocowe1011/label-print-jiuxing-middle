package com.middle.label.order.controller;

import com.middle.label.hander.ResponseResult;
import com.middle.label.order.entity.dto.OrderBoxInfoDTO;
import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.entity.po.UrValueFkTask;
import com.middle.label.order.service.OrderService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (UrValueFk)控制器
 *
 * @author 文亮
 * @since 2024-04-07 23:13:16
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 获取机台任务列表
     * @return
     */
    @RequestMapping("/getMachineList")
    public ResponseResult<List<UrValueFkTask>> getMachineList() {
        return ResponseResult.success(orderService.getMachineList());
    }

    /**
     * 查询按照箱编号正序排序的第一个订单信息
     * @return
     */
    @RequestMapping("/getOrderBoxInfo")
    public ResponseResult<UrValueFk> getOrderBoxInfo(@RequestBody OrderBoxInfoDTO orderBoxInfoDTO) {
        return ResponseResult.success(orderService.getOrderBoxInfo(orderBoxInfoDTO));
    }

/**
    * 更新
    *
    * @param  urValueFk
    */
    @PostMapping("/dealAfterPrint")
    public ResponseResult<Integer> dealAfterPrint(@RequestBody UrValueFk urValueFk) {
        return ResponseResult.success(this.orderService.dealAfterPrint(urValueFk));
    }
}
