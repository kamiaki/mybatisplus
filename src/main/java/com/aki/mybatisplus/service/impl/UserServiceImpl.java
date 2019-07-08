package com.aki.mybatisplus.service.impl;

import com.aki.mybatisplus.entity.User;
import com.aki.mybatisplus.mapper.UserMapper;
import com.aki.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Aki
 * @since 2019-07-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
