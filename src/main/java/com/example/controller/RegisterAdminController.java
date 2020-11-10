package com.example.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Admin;
import com.example.form.RegisterAdminForm;
import com.example.service.RegisterAdminService;

/**
 * 管理者登録を行うコントローラ.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("/admin")
public class RegisterAdminController {

	@Autowired
	private RegisterAdminService registerAdminService;
	
	@ModelAttribute
	public RegisterAdminForm setUpForm() {
		return new RegisterAdminForm();
	}
	
	@RequestMapping("/register")
	public String showRegister() {
		return "users/register_admin";
	}
	
	@RequestMapping("/registerAdmin")
	public String registerAdmin(@Validated RegisterAdminForm form, BindingResult result) {
		Admin registeredAdmin = registerAdminService.findByEmail(form.getEmail());
		
		if(!(ObjectUtils.isEmpty(registeredAdmin))) {
			result.rejectValue("email", "", "このメールアドレスは既に登録されています。");
		}
		
		if(!(form.getPassword().equals(form.getConfirmPassword()))) {
			result.rejectValue("password", "", "パスワードが一致していません。");
			result.rejectValue("confirmPassword", "", "");
			
		}
		
		if(result.hasErrors()) {
			return showRegister();
		}
		
		Admin admin = new Admin();
		
		admin.setName(form.getName());
		admin.setEmail(form.getEmail());
		admin.setZipcode(form.getZipcode());
		admin.setAddress(form.getAddress());
		admin.setTel(form.getTel());
		admin.setPassword(form.getPassword());
		admin.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		admin.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		
		registerAdminService.registerAdmin(admin);
		
		return "redirect:/admin/register";
	}
}
