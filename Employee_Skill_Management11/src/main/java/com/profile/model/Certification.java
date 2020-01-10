package com.profile.model;

public class Certification {

	String certificationTitle;
	String certificationType;

	public Certification() {
		super();
	}

	public Certification(String certificationTitle, String certificationType) {
		super();
		this.certificationTitle = certificationTitle;
		this.certificationType = certificationType;
	}

	/**
	 * @return the certificationTitle
	 */
	public String getCertificationTitle() {
		return certificationTitle;
	}

	/**
	 * @param certificationTitle the certificationTitle to set
	 */
	public void setCertificationTitle(String certificationTitle) {
		this.certificationTitle = certificationTitle;
	}

	/**
	 * @return the certificationType
	 */
	public String getCertificationType() {
		return certificationType;
	}

	/**
	 * @param certificationType the certificationType to set
	 */
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

}
