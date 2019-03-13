package com.kmj.krdbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengjian.ke create in 16:43 2018/9/28
 */
@RestController
public class HelloKrdController {

    @RequestMapping("/helloKrd")
    public String sayHelloKrd(){
        return "sayHelloKrd";
    }

}
