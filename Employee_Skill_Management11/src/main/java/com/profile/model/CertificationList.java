package com.profile.model;

import java.util.List;

public class CertificationList {

	List<Certification> certificationList;

	public CertificationList() {
		super();
	}

	public CertificationList(List<Certification> certificationList) {
		super();
		this.certificationList = certificationList;
	}

	/**
	 * @return the certificationList
	 */
	public List<Certification> getCertificationList() {
		return certificationList;
	}

	/**
	 * @param certificationList the certificationList to set
	 */
	public void setCertificationList(List<Certification> certificationList) {
		this.certificationList = certificationList;
	}

}
