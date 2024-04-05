package com.middle.label.config.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.middle.label.config.entity.LabelConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * @classDesc: 数据访问接口:(CssConfig)
 * @author: makejava
 * @date: 2023-07-04 15:31:47
 * @copyright 众阳健康
 */
@Mapper
public interface LabelConfigMapper extends BaseMapper<LabelConfig> {


    LabelConfig getConfig();
}
