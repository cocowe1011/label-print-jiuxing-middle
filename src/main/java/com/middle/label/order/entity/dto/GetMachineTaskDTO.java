package com.middle.label.order.entity.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 文亮
 * @description 查询机台信息入参
 * @date 2024-04-2024/4/23-14:03
 */
@Data
public class GetMachineTaskDTO {
    /**
     * 机台名称
     */
    private String machine;
}
