package com.wx.disparent.mallparent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/f")
public class IndexControl {
    @RequestMapping("/ff")
    public String geta(){
        return "index";
    }
}
