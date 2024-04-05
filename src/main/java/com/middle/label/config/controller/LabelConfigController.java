package com.middle.label.config.controller;

import com.middle.label.config.entity.LabelConfig;
import com.middle.label.config.service.LabelConfigService;
import com.middle.label.hander.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @classDesc: 控制器:(LabelConfig)
 * @author: makejava
 * @date: 2023-07-04 15:31:37
 * @copyright 众阳健康
 */
@RestController
@RequestMapping("/labelConfig")
public class LabelConfigController {
    
    @Resource
    private LabelConfigService labelConfigService;

    @PostMapping("/update")
    public ResponseResult<Integer> update (@RequestBody LabelConfig cssConfig) {
        return ResponseResult.success(labelConfigService.update(cssConfig));
    }

    @RequestMapping("/getConfig")
    public ResponseResult<LabelConfig> getConfig() {
        return ResponseResult.success(labelConfigService.getConfig());
    }
}
