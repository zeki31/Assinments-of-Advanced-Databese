package com.example.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // GET /
    @GetMapping("/")
    public String index() {
        // 前のパスの拡張子はSpringMVCが補完してくれるので書かなくてよい
        return "index";
    }

}