package com.middle.label.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.middle.label.order.entity.dto.OrderBoxInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import com.middle.label.order.entity.po.UrValueFk;
/**
 * (UrValueFk)表数据库访问层
 *
 * @author 文亮
 * @since 2024-04-07 23:13:06
 */
@Mapper
public interface UrValueFkMapper extends BaseMapper<UrValueFk> {
    /**
     * 查询按照箱编号正序排序的第一个订单信息
     * @param orderBoxInfoDTO
     * @return
     */
    UrValueFk getOrderBoxInfoForUpdate(OrderBoxInfoDTO orderBoxInfoDTO);
}
