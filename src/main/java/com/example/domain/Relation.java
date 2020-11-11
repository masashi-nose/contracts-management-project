package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 続柄情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Relation {
	/** ID */
	private Integer id;
	/** 続柄 */
	private String relation;
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