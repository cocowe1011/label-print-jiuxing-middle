package com.middle.label.config.service.impl;

import com.middle.label.config.dao.LabelConfigMapper;
import com.middle.label.config.entity.LabelConfig;
import com.middle.label.config.service.LabelConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @classDesc: 业务逻辑:(CssConfig)
 * @author: makejava
 * @date: 2023-07-04 15:31:43
 * @copyright 众阳健康
 */
@Service
public class LabelConfigServiceImpl implements LabelConfigService {
    @Resource
    private LabelConfigMapper labelConfigMapper;

    @Override
    public Integer update (LabelConfig labelConfig) {
        return labelConfigMapper.updateById(labelConfig);
    }

    @Override
    public LabelConfig getConfig() {
        return labelConfigMapper.getConfig();
    }
}
