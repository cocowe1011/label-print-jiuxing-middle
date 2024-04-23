package com.middle.label.order.entity.po;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * (UrValueFk)实体类
 *
 * @author 文亮
 * @since 2024-04-07 23:13:14
 */
@Data
@TableName("UR_VALUE_FK")
public class UrValueFk{
    
    /**
    * 表ID
    */
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer id;

    /**
    * 数据时间戳
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dstatuschange;

    /**
    * 生产订单ID,唯一标识码
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
    * 外箱长度
    */
    private BigDecimal length;

    /**
    * 外箱宽度
    */
    private BigDecimal width;

    /**
    * 外箱高度
    */
    private BigDecimal height;

    /**
    * 货物始终生产代号,0：第一件货物
1：生产中的货物
2：最后一件货物
3：补打印的货物

    */
    private Integer productionSerial;

    /**
    * 打包机打包次数
    */
    private String isPack;

    /**
    * 喷码机打印次数
    */
    private String isPrint;

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
    * 是否完成喷印,0：已取未喷
10：已喷
20：锁定（正在编辑，不允许喷印）
-10：作废
-20：未喷 

    */
    private Integer isComplete;

    /**
    * 补打印次数
    */
    private Integer reprintingTime;

    /**
    * 箱序号
    */
    private String iIndex;

    /**
    * 班组名称
    */
    private String team;

    /**
    * 操作人员
    */
    private String operator;

    /**
    * 是否入库通知
    */
    private Integer isinto;

    /**
    * 采集承重成功,0: 未成功
1：已成功

    */
    private Integer isgather;

    /**
     * 测量重量-回更表数据
     */
    private BigDecimal nweight;

    /**
     * 备注
     */
    private String cremark;
}
