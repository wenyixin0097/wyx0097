package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study
 * @description:
 * @author: 闻亦昕
 * @create: 2019-11-20 10:03
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "Hello World!";
    }
}
