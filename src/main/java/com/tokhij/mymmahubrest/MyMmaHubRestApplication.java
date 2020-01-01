package com.tokhij.mymmahubrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@SpringBootApplication
public class MyMmaHubRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMmaHubRestApplication.class, args);
	}

}
