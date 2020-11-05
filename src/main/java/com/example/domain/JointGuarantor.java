package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 連帯保証人情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class JointGuarantor {
	/** ID */
	private Integer id;
	/** 連帯保証人名 */
	private String name;
	/** メールアドレス */
	private String email;
	/** 郵便番号 */
	private String zipcode;
	/** 住所 */
	private String address;
	/** 電話番号 */
	private String tel;
	/** 誕生日 */
	private Date birthday;
	/** 続柄ID */
	private Integer relationId;
	/** 備考 */
	private String comment;
	/** 登録者ID */
	private Integer creatorId;
	/** 登録日 */
	private Date createdAt;
	/** 更新者ID */
	private Integer updaterId;
	/** 更新日 */
	private Date updatedAt;
	/** バージョン */
	private Integer version;

}