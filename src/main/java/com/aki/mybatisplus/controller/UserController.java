package com.aki.mybatisplus.controller;


import com.aki.mybatisplus.entity.User;
import com.aki.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aki
 * @since 2019-07-09
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "test")
    public User test(){
        User user = userService.selectOneUser(1);
        System.out.println(user);
        IPage<User> userIPage = userService.selectPageVo(new Page(1, 2), 1);
        System.out.println(userIPage);

        return userService.getOne(new QueryWrapper<User>().eq("id", "1"));
    }
}
