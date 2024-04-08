package com.middle.label.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.middle.label.order.entity.po.UrValueFkTask;
import java.util.List;
/**
 * (UrValueFkTask)表数据库访问层
 *
 * @author 文亮
 * @since 2024-04-08 20:53:57
 */
@Mapper
public interface UrValueFkTaskMapper extends BaseMapper<UrValueFkTask> {
    /**
     * 获取机台任务列表
     * @return
     */
    List<UrValueFkTask> getMachineList();
}
