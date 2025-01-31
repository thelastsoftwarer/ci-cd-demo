package com.devops.ci_cd_demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CiCdDemoController {

    @GetMapping("/")
    public String index() {
        return "index";  // 'index' view'ini döndürür
    }
}