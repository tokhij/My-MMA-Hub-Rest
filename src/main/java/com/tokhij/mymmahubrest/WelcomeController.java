package com.tokhij.mymmahubrest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class WelcomeController {
    @RequestMapping
    @ResponseBody
    public String sayHello(){
        return "Hello White Belt Fighter!";
    }



}
