package com.example.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

/**
 * 管理者登録画面からパラメータを受け取るフォーム.
 * 
 * @author masashi.nose
 *
 */
@Data
public class RegisterAdminForm {

	/** 名前 */
	@NotBlank(message = "名前の入力は必須です。")
	private String name;
	
	/** メールアドレス */
	@NotBlank(message = "メールアドレスの入力は必須です。")
	@Email(message = "メールアドレスの形式が不正です。")
	private String email;
	
	/** 郵便番号 */
	@NotBlank(message = "郵便番号の入力は必須です。")
	@Pattern(regexp="^[0-9]{7}$", message="郵便番号が不正です。")
	private String zipcode;
	
	/** 住所 */
	@NotBlank(message = "住所の入力は必須です。")
	private String address;
	
	/** 電話番号 */
	@NotBlank(message = "電話番号の入力は必須です。")
	@Pattern(regexp="0\\d{1,4}\\d{1,4}\\d{4}", message="電話番号が不正です。")
	private String tel;
	
	/** パスワード */
	@NotBlank(message = "パスワードの入力は必須です。")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,16}$", message="パスワードが不正です。")
	private String password;
	
	/** 確認パスワード */
	@NotBlank(message = "確認用パスワードの入力は必須です。")
	private String confirmPassword;

}
