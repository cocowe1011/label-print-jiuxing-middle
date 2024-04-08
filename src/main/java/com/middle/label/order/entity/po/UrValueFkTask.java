package com.middle.label.order.entity.po;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * (UrValueFkTask)实体类
 *
 * @author 文亮
 * @since 2024-04-08 20:53:59
 */
@Data
@TableName("UR_VALUE_FK_TASK")
public class UrValueFkTask {
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer id;

    /**
    * 获取当前操作日期
    */
    private Date dstatuschange;

    /**
    * 生产订单ID
    */
    private Integer idScproduct;

    /**
    * 生产订单号,也就是批次号
    */
    private String ccodeScproduct;

    /**
    * 设备作业ID
    */
    private Integer idMjob;

    /**
    * 当前作业机台名称
    */
    private String machine;

    /**
    * 作业状态
    */
    private Integer istatusMjob;

    /**
    * 产品追溯二维码,网址+参数
    */
    private String web;

    /**
    * 生产订单状态
    */
    private Integer istatusScproduct;
}
