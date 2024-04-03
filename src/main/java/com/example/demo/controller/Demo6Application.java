package com.example.demo.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}
		
	
		@GetMapping("randomname")
		public String randomname() {
		    return "randomname";
		}
		
		@GetMapping("body")
		public String body() {
		    return "body";
		}
	

}
