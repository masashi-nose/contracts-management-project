package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 契約者一覧を表示するコントローラ.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("/contractors")
public class ShowContractorsController {

	@RequestMapping("/")
	public String showContractors() {
		return "contracts/top";
	}
}
