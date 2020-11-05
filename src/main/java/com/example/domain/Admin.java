package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 
 * 管理者情報を格納するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Admin {

	/** ID */
	private Integer id;
	/** 管理者名 */
	private String name;
	/** メールアドレス */
	private String email;
	/** 郵便番号 */
	private String zipcode;
	/** 住所 */
	private String address;
	/** 電話番号 */
	private String tel;
	/** パスワード */
	private String password;
	/** 登録日 */
	private Date createdAt;
	/** 更新日 */
	private Date updatedAt;
	/** 削除フラグ */
	private boolean deleted;

}