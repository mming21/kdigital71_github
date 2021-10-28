package edu.spring.naverserver;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	//이제 네이버 서버로 옮기게 되면 내장 tomcat이 없으니 설정된 서버한테 실행하라고 시키는 것
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Kdigital71StsApplication.class);
	}

}
