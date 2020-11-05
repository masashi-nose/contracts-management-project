package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 棟情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Building {
	/** ID */
	private Integer id;
	/** 棟名 */
	private String buildingName;
	/** 棟郵便番号 */
	private String buildingZipcode;
	/** 棟住所 */
	private String buildingAddress;
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