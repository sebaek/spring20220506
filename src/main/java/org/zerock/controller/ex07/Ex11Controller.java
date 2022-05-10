package org.zerock.controller.ex07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex11")
public class Ex11Controller {

//	@RequestMapping(value = "login", method = RequestMethod.GET)
	@GetMapping("login")
	public void loginForm() {
		
		System.out.println("로그인 화면으로 포워드");
	}
	
//	@RequestMapping(path = "login", method = RequestMethod.POST)
	@PostMapping("login")
	public void loginProcess() {
		
		System.out.println("로그인 처리 !!!!");
		
	}
}










