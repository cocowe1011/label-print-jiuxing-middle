package com.middle.label.config.service;

import com.middle.label.config.entity.LabelConfig;

/**
 * @classDesc: 业务接口:(CssConfig)
 * @author: makejava
 * @date: 2023-07-04 15:31:45
 * @copyright 众阳健康
 */
public interface LabelConfigService {

    Integer update(LabelConfig labelConfig);

    LabelConfig getConfig();
}
