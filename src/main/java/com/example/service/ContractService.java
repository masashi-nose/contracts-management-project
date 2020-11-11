package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Contract;
import com.example.mapper.ContractMapper;

/**
 * 契約情報の処理を行うサービスクラス.
 * 
 * @author masashi.nose
 *
 */
@Service
@Transactional
public class ContractService {

	@Autowired
	private ContractMapper contractMapper;

	/**
	 * 契約情報全件検索.
	 * 
	 * @return 契約情報リスト
	 */
	public List<Contract> findAll() {
		return contractMapper.selectAll();
	}

	/**
	 * 契約情報をIDで1件検索.
	 * 
	 * @param id ID
	 * @return 契約情報オブジェクト
	 */
	public Contract findById(Integer id) {
		return contractMapper.selectById(id);
	}
}
