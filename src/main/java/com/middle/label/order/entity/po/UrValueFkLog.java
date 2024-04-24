package com.middle.label.order.entity.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (UrValueFkLog)实体类
 *
 * @author 文亮
 * @since 2024-04-09 20:15:58
 */
@Data
@TableName("UR_VALUE_FK_log")
public class UrValueFkLog{
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
    * 数据时间戳
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dstatuschange;

    /**
    * 生产订单ID
    */
    private Integer idScproduct;

    /**
    * 产品版本ID
    */
    private Integer idRequest;

    /**
    * 生产订单号,也就是批次号
    */
    private String ccodeScproduct;

    /**
    * 唯一标识码,生产订单ID+'_'产品版本ID组成的唯一字符串
    */
    private String ccodeOnly;

    /**
    * 当前作业机台名称
    */
    private String machine;

    /**
    * 班组名称
    */
    private String team;

    /**
    * 操作人员
    */
    private String operator;

    /**
    * 操作类型
    */
    private String operationType;

    /**
    * 操作详细情况
    */
    private String remarks;
}
