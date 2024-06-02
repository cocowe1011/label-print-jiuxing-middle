package com.middle.label.order.entity.po;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (UrValuePrintsave)实体类
 *
 * @author 文亮
 * @since 2024-06-02 23:55:02
 */
@Data
@TableName("UR_VALUE_PRINTSAVE")
public class UrValuePrintsave {

    /**
    * 表ID
    */
    @TableId(type = IdType.AUTO)
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer id;

    /**
    * 生产订单号,也就是批次号
    */
    private String ccodeScproduct;

    /**
    * 产品编号
    */
    private String ccodeScaproduct;

    /**
    * 产品名称
    */
    private String cnameScaproduct;

    /**
    * 客户品名
    */
    private String customerName;

    /**
    * 委印单号
    */
    private String orderNumber;

    /**
    * 客户批号
    */
    private String customerNumber;

    /**
    * 客户料号
    */
    private String customerMaterialNumber;

    /**
    * 检验合格信息
    */
    private String inspection;

    /**
    * 药品规格
    */
    private String drugSpecification;

    /**
    * 当前作业机台名称,生产线代号
    */
    private String machine;

    /**
    * 每箱包装数量
    */
    private BigDecimal namount;

    /**
    * 客户名称
    */
    private String customer;

    /**
    * 喷码机打印次数,打包机打包次数,货物始终生产代号,外箱高度,外箱宽度,外箱长度, 箱序号，生产订单号
    */
    private String qrCode;

    /**
    * 补打印次数
    */
    private Integer reprintingTime;

    /**
    * 箱序号
    */
    private String iindex;

    /**
    * 班组名称
    */
    private String team;

    /**
    * 操作人员
    */
    private String operator;

    /**
    * 体重
    */
    private BigDecimal nweight;

    /**
    * 备注
    */
    private String cremark;

    /**
    * 标签号
    */
    private Integer iboxtag;

    /**
    * 班次
    */
    private String cclass;

    /**
    * 版本号
    */
    private Integer ivers;

    /**
    * 箱单位
    */
    private String camountunit;

    /**
    * UR_VALUE_FK表ID
    */
    private Integer idUrValueFk;

    
    private Date ddate;

    /**
    * 订单数量
    */
    private BigDecimal nproductamount;
}
