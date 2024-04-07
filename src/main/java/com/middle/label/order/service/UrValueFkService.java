package com.middle.label.order.service;

import com.middle.label.order.entity.po.UrValueFk;
import org.springframework.validation.annotation.Validated;
/**
 * (UrValueFk)表服务接口
 *
 * @author 文亮
 * @since 2024-04-07 23:13:06
 */
@Validated
public interface UrValueFkService {
    /**
     * 修改数据
     *
     * @param urValueFk 实例对象
     * @return 成功为1，失败为0
     */
    int update(UrValueFk urValueFk);
}
