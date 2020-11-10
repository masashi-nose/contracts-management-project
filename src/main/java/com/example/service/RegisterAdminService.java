package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Admin;
import com.example.mapper.AdminMapper;

/**
 * 管理者登録を行うサービス.
 * 
 * @author masashi.nose
 *
 */
@Service
@Transactional
public class RegisterAdminService {
	
	@Autowired
	private AdminMapper adminMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/**
	 * 管理者を登録.
	 * 
	 * @param admin
	 * @return
	 */
	public int registerAdmin(Admin admin) {
		String encodedPassword = passwordEncoder.encode(admin.getPassword());
		admin.setPassword(encodedPassword);
		
		return adminMapper.insert(admin);
	}
	
	/**
	 * メールアドレスで1件検索.
	 * 
	 * @param email
	 * @return
	 */
	public Admin findByEmail(String email) {
		return adminMapper.selectByEmail(email);
	}

}
