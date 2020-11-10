package com.example.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.domain.Admin;
import com.example.domain.LoginUser;
import com.example.mapper.AdminMapper;

/**
 * ログイン後のユーザー情報に権限付与するサービスクラス.
 * 
 * @author masashi.nose
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
		
		Admin admin = adminMapper.selectByEmail(email);
		if(ObjectUtils.isEmpty(admin)) {
			throw new UsernameNotFoundException("そのメールアドレスは登録されていません。");
			
		}
		
		//権限付与の例
		Collection<GrantedAuthority> authorityList = new ArrayList<>();
		authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		return new LoginUser(admin, authorityList);
	}
}
