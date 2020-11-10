package com.example.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * ユーザーのログイン情報を格納するクラス.
 * 
 * @author masashi.nose
 *
 */
public class LoginUser extends User{
	
	private static final long serialVersionUID = 1L;

	/** ユーザ情報 */
	private final Admin admin;

	public LoginUser(Admin admin, Collection<GrantedAuthority> authorityList) {
		super(admin.getEmail(), admin.getPassword(), authorityList);
		this.admin = admin;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	
}
