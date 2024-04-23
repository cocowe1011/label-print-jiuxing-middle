package com.middle.label.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.middle.label.order.entity.dto.GetMachineTaskDTO;
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
     * 获取当前作业机台
     * @param getMachineTaskDTO
     * @return
     */
    List<UrValueFkTask> getMachineTask(GetMachineTaskDTO getMachineTaskDTO);
}
