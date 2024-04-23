package com.middle.label.order.entity.dto;

import lombok.Data;

/**
 * @author 文亮
 * @description 查询订单信息入参
 * @date 2024-04-2024/4/10-0:27
 */
@Data
public class OrderBoxInfoDTO {
    /**
     * 机台名称
     */
    private String machine;

    /**
     * 生产订单ID,唯一标识码
     */
    private Integer idScproduct;
}
