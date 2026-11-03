package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/") // /경로로 들어오는 get 요청 처리
    @ResponseBody
    public String index() {
        return "메롱";
    }

    @GetMapping("/hello") // /hello 경로로 들어오는 get 요청 처리
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
}