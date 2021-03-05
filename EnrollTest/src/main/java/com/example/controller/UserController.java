package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.UserVo;
import com.example.service.UsersService;


@RestController
public class UserController {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UsersService service;
	
	 //회원가입 화면
	@GetMapping(value="/enroll")
	public String enrollUI() {
		return "userEnroll";
	}
	/*
	//글쓰기
	@PostMapping("/enroll")
	@ResponseBody
	public String userEnroll(UserVo uservo) {
		int num = service.userEnroll(uservo);
		return "ok";
	}*/
	
	@PostMapping("/enroll")
	public String userEnroll(UserVo uservo) {
		int num = service.userEnroll(uservo);
		return "ok";
	}
	
	@GetMapping("/user")
	public List<UserVo> selectUserList() {
		List<UserVo> list = service.selectUserList();
		System.out.println("yejjjjjjjjjjjjjjjjjjjjin");
		/*for(UserVo user: list) {
			System.out.println("index "+ToStringBuilder.reflectionToString(user));
		}*/
		System.out.println("list2 "+list);
		
		return service.selectUserList();
	}
	

}
