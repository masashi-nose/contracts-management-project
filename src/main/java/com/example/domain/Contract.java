package com.example.domain;

import java.util.Date;

import lombok.Data;

/**
 * 契約情報を保持するドメイン.
 * 
 * @author masashi.nose
 *
 */
@Data
public class Contract {
	/** ID */
	private Integer id;
	/** 契約者ID */
	private Integer contractorId;
	/** 連帯保証人ID */
	private Integer jointGuarantorId;
	/** 店舗ID */
	private Integer shopId;
	/** 棟ID */
	private Integer buildingId;
	/** 賃料 */
	private Integer rent;
	/** 敷金 */
	private Integer deposit;
	/** 町内会費ID */
	private Integer duesId;
	/** 銀行ID */
	private Integer bankId;
	/** 契約開始日 */
	private Date startAt;
	/** 契約終了日 */
	private Date endAt;
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