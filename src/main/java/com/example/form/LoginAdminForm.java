package com.example.form;

import lombok.Data;

/**
 * ログイン画面からパラメータを受け取るフォーム.
 * 
 * @author masashi.nose
 *
 */
@Data
public class LoginAdminForm {

	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;

}
