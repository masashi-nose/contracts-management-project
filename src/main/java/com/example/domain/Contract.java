package com.example.domain;

import java.sql.Timestamp;
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
	private Timestamp createdAt;
	/** 更新者ID */
	private Integer updaterId;
	/** 更新日 */
	private Timestamp updatedAt;
	/** バージョン */
	private Integer version;
	/** 契約者 */
	private Contractor contractor;
	/** 連帯保証人 */
	private JointGuarantor jointGuarantor;
	/** 店舗 */
	private Shop shop;
	/** 棟 */
	private Building building;
	/** 町内会費 */
	private Due due;
	/** 銀行 */
	private Bank bank;
	/** 登録者 */
	private Admin creator;
	/** 更新者 */
	private Admin updater;

}