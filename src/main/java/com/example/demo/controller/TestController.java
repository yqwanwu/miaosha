package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by YQ on 2018/8/20.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "hehefa";
    }
}
