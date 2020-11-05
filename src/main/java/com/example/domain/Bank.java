package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 銀行情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Bank {

	/** ID */
	private Integer id;
	/** 銀行名 */
	private String bankName;
	/** 支店名 */
	private String branchName;
	/** 口座番号 */
	private Integer accountNumber;
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