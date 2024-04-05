package com.middle.label.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.middle.label.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @classDesc: 数据访问接口:(UserInfo)
 * @author: makejava
 * @date: 2023-06-27 20:58:15
 * @copyright 众阳健康
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    /**
     * 查询用户信息
     * @param userInfo 入参
     * @return 出参
     */
    List<UserInfo> selectUserList(UserInfo userInfo);

    Integer updatePassword(UserInfo userInfo);
}
