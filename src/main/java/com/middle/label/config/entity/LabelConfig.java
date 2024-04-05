package com.middle.label.config.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @classDesc: 实体类:(CssConfig)
 * @author: makejava
 * @date: 2023-07-04 15:31:49
 * @copyright 众阳健康
 */
@Data
@TableName("css_config")
public class LabelConfig {
    /**
    * 主键
    */
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Long configId;

    /**
    * 连接plcip地址
    */    
    private String plcIp;
                
    /**
    * 连接plc端口
    */    
    private String plcPort;
                
    /**
    * L11长度
    */    
    private String oneOneLength;
                
    /**
    * l2长度
    */    
    private String twoLength;
                
    /**
    * 判断禁止上货点位
    */    
    private String judgeLoadPoint;

    /**
     * 延迟时间
     */
    private String delayPointTime;

    /**
     * J
     */
    private BigDecimal pointjLength;

    /**
     * K
     */
    private BigDecimal pointkLength;

    /**
     * L
     */
    private BigDecimal pointlLength;
    
}
