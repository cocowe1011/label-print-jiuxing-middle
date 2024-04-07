package com.middle.label.order.service.impl;
import com.middle.label.order.entity.po.UrValueFk;
import com.middle.label.order.dao.UrValueFkMapper;
import com.middle.label.order.service.UrValueFkService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * (UrValueFk)表服务实现类
 *
 * @author 文亮
 * @since 2024-04-07 23:13:06
 */
@Service("urValueFkService")
public class UrValueFkServiceImpl implements UrValueFkService {

    @Resource
    private UrValueFkMapper urValueFkMapper;

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public int update(UrValueFk entity) {
        //1.将新增页面中的信息转换为po对象
        int update = this.urValueFkMapper.updateById(entity);
        return update;
    }
}
