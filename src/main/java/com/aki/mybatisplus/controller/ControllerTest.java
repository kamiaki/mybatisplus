package com.aki.mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ControllerTest {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
