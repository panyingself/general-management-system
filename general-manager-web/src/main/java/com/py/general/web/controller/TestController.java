package com.py.general.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by py on 2017/11/29.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test")
    public String  test(){
        return  "test1";
    }

}
