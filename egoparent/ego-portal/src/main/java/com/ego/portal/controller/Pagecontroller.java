package com.ego.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {

    @RequestMapping("/")
    public String welCome(){
        return "forward:/showBigPic";
    }

}
