package com.xhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maps
 * @create 2020-03-19 10:11
 */
@Controller
public class indexController {

    @RequestMapping("/admin/welcome")
    public String welcome(){
        return "admin/welcome";
    }
}
