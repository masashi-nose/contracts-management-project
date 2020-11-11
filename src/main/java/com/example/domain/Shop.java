package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 店舗情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Shop {
	/** ID */
	private Integer id;
	/** 棟ID */
	private Integer buildingId;
	/** 店舗名 */
	private String shopName;
	/** インスタURL */
	private String instaUrl;
	/** FBURL */
	private String fbUrl;
	/** ツイッターURL */
	private String twtUrl;
	/** ホームページURL */
	private String hpUrl;
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
	/** 棟 */
	private Building building;
	/** 管理者 */
	private Admin admin;

}