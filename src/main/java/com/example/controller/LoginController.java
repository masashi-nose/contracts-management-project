package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.form.LoginAdminForm;

/**
 * ログイン周りのコントローラ.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
	
	@ModelAttribute
	public LoginAdminForm setUpForm() {
		return new LoginAdminForm();
	}

	/**
	 * ログイン画面を表示.
	 * 
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String showLogin(Model model,@RequestParam(required = false) String error) {
		if (error != null) {
			model.addAttribute("errorMessage", "メールアドレスまたはパスワードが不正です。");
		}
		return "users/login_admin";
	}
}

