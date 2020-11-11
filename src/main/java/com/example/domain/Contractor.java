package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 契約者情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Contractor {
	/** ID */
	private Integer id;
	/** 契約名 */
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
	/** 店舗ID */
	private Integer shopId;
	/** 連帯保証人ID */
	private Integer jointGuarantorId;
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
	/** 店舗 */
	private Shop shop;
	/** 連帯保証人 */
	private JointGuarantor jointGuarantor;
	/** 管理者 */
	private Admin admin;

}