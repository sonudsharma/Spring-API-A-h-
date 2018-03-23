package com.devglan;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

//import com.config.RESTFulCORSFilter;
import com.devglan.config.CORSFilter;



@SpringBootApplication


public class Application {

    
		public static void main(String[] args) {

        		SpringApplication.run(Application.class, args);
        		someFilterRegistration();

    		}
		
		public static FilterRegistrationBean someFilterRegistration() {
			CORSFilter filter = new CORSFilter();
			FilterRegistrationBean registration = new FilterRegistrationBean();
			registration.setFilter(filter);
			registration.addUrlPatterns("/*");
			// registration.addInitParameter("paramName", "paramValue");
			registration.setName("CORS Filter");
			registration.setOrder(1);
			System.out.println("Filter");
			return registration;
		}


	}
