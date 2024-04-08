package com.middle.label.order.service;

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
    int update(UrValueFk urValueFk);

    /**
     * 获取机台任务列表
     * @return
     */
    List<UrValueFkTask> getMachineList();
}