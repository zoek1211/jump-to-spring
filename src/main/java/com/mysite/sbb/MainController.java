package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/") // /경로로 들어오는 get 요청 처리
    public String index() {
        return "redirect:/question/list";
    }


}