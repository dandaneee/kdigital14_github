package com.kakao.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override //tomcat 설정 -실행
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		return application.sources(Kdigital14StsApplication.class);
	}

}
