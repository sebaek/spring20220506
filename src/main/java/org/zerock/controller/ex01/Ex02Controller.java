package org.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
public class Ex02Controller {

	@RequestMapping("sub01")
	public void method01() {
		System.out.println("/ex02/sub01 일함");
	}
	
	@RequestMapping("sub02")
	public void method02() {
		System.out.println("/ex02/sub02 일함");
	}
}
