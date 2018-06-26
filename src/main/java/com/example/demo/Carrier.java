package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrier1")
public class Carrier {
	
	
	protected Carrier() {
	}
	
	
	
	public Carrier(String carrierId, String eccId, String nenaIdCode, String featurePlan) {

		this.carrierId = carrierId;
		this.eccId = eccId;
		this.nenaIdCode = nenaIdCode;
		this.featurePlan = featurePlan;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "carrierid")
    private String carrierId;
    
	@Column(name = "eccid")
    private String eccId;
	
	
	@Column(name = "nenaidcode")
    private String nenaIdCode;
	
	
	@Column(name = "featureplan")
    private String featurePlan;


	public String getCarrierId() {
		return carrierId;
	}



	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}



	public String getEccId() {
		return eccId;
	}



	public void setEccId(String eccId) {
		this.eccId = eccId;
	}



	public String getNenaIdCode() {
		return nenaIdCode;
	}



	public void setNenaIdCode(String nenaIdCode) {
		this.nenaIdCode = nenaIdCode;
	}



	public String getFeaturePlan() {
		return featurePlan;
	}



	public void setFeaturePlan(String featurePlan) {
		this.featurePlan = featurePlan;
	}

}
