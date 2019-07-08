package com.aki.mybatisplus.web;


import com.aki.mybatisplus.entity.User;
import com.aki.mybatisplus.service.IUserService;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Aki
 * @since 2019-07-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userSvc;

    //        http://localhost:8080/user/show
    @GetMapping(value = "/show")
    public JSONObject testEnum() {
        Page<User> users = userSvc.selectPage(new Page<>(1, 10));
        JSONObject result = new JSONObject();
        result.put("users", users);
        return result;
    }

}
