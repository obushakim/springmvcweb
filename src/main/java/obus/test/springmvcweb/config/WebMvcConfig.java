package obus.test.springmvcweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "obus.test.springmvcweb" })
public class WebMvcConfig implements WebMvcConfigurer {

	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
	}

}
