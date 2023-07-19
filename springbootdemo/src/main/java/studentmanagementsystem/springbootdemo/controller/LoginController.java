package studentmanagementsystem.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPagge")
	public String showMyLoginPage() {
		
		return "plain-login";
		
	}
}
