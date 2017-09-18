package com.hjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HelloController {
	@RequestMapping("/index")
    public String index(Model model) {
        System.out.println("asd121f");
        return  "index";
    }
}
