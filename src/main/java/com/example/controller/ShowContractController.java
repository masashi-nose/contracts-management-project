package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Contract;
import com.example.service.ContractService;

/**
 * 契約情報を表示するコントローラ.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("/contracts")
public class ShowContractController {

	@Autowired
	private ContractService contractService;
	
	/**
	 * トップページに契約情報全件表示.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/top")
	public String showContractList(Model model) {
		List<Contract> contractList = contractService.findAll();

		contractList.forEach(e -> System.out.println(e.getJointGuarantor().getName()));
		
		if(contractList.isEmpty()) {
			model.addAttribute("emptyMsg", "現在登録している情報はありません。");
		
		}else {
			model.addAttribute("contractList", contractList);
		}
		
		return "contracts/top";
	}
	
	/**
	 * 契約情報詳細を表示（契約情報編集画面表示）.
	 * 
	 * @param id ID
	 * @param model
	 * @return
	 */
	@RequestMapping("/edit")
	public String showContractDetail(Integer id, Model model) {
		Contract contract = contractService.findById(id);
		System.out.println(contract);
		
		if(ObjectUtils.isEmpty(contract)) {
			model.addAttribute("errorMdg", "エラーが発生しました。");
		
		}else {
			model.addAttribute("contract", contract);
		}
		
		return "contractors/edit_contractors";
		
		
	}
	
}
