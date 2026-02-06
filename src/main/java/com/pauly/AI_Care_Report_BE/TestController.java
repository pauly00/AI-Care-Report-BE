package com.pauly.AI_Care_Report_BE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 초기실행용 테스트 api 생성
@RestController
public class TestController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Spring Boot Server is Running!";
    }
}