package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 町内会費情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Due {
	/** ID */
	private Integer id;
	/** 価格 */
	private Integer price;
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
	/** 管理者 */
	private Admin admin;
}