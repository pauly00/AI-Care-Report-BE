package com.pauly.AI_Care_Report_BE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
// DB연동 오류 제어
//		(exclude = {DataSourceAutoConfiguration.class})

public class AiCareReportBeApplication {
	public static void main(String[] args) {
		SpringApplication.run(AiCareReportBeApplication.class, args);
	}
}
