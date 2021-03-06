package com.acn.yrs.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ASSETS")
public class Asset {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "assessmentid")
	private Assessment assessment;

	@ManyToOne
	@JoinColumn(name = "assettype")
	private AssetType assetType;

	@Column(name = "assetamount", nullable = false)
	private BigDecimal assetamount;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the assessment
	 */
	public Assessment getAssessment() {
		return assessment;
	}

	/**
	 * @param assessment the assessment to set
	 */
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	/**
	 * @return the assetType
	 */
	public AssetType getAssetType() {
		return assetType;
	}

	/**
	 * @param assetType the assetType to set
	 */
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	/**
	 * @return the assetamount
	 */
	public BigDecimal getAssetamount() {
		return assetamount;
	}

	/**
	 * @param assetamount the assetamount to set
	 */
	public void setAssetamount(BigDecimal assetamount) {
		this.assetamount = assetamount;
	}

}
