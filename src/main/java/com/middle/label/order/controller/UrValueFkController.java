package com.middle.label.order.controller;

import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.service.UrValueFkService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * (UrValueFk)控制器
 *
 * @author 文亮
 * @since 2024-04-07 23:13:16
 */

@RestController
@RequestMapping("/UR_VALUE_FK")
public class  UrValueFkController {

    @Resource
    private UrValueFkService urValueFkService;
    
/**
    * 更新
    *
    * @param  urValueFk
    */
    @PostMapping("/update")
    public void update(@RequestBody UrValueFk urValueFk) {
        this.urValueFkService.update(urValueFk);
    }
}
