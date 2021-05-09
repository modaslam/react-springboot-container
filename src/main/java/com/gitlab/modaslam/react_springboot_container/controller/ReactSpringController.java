package com.gitlab.modaslam.react_springboot_container.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactSpringController {
	@GetMapping("/**/{[path:[^\\.]*}")
	public String index() {
		return "forward:/";
	}
}
