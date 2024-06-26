package com.middle.label.order.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 文亮
 * @description 查询已经打印过的订单入参
 * @date 2023-06-2023/6/24-0:40
 */
@Data
public class GetOrderListPageDTO {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 生产订单号,也就是批次号
     */
    private String ccodeScproduct;

    /**
     * 箱序号
     */
    private String iIndex;

    /**
     * 箱序号
     */
    private String machine;

    /**
     * 起始页数
     */
    @NotNull(message = "起始页数不能为空")
    private Integer pageNum;

    /**
     * 每页大小
     */
    @NotNull(message = "每页大小")
    private Integer pageSize;
}
