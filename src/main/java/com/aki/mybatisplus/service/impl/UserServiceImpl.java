package com.aki.mybatisplus.service.impl;

import com.aki.mybatisplus.entity.User;
import com.aki.mybatisplus.mapper.UserMapper;
import com.aki.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Aki
 * @since 2019-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectOneUser(Integer id) {
        return userMapper.selectOneUser(id);
    }

    @Override
    public IPage<User> selectPageVo(Page page, Integer userAge) {
        return userMapper.selectPageVo(page, userAge);
    }
}
