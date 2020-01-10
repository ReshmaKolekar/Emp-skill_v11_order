package com.profile.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Certification")
public class CertificationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "certificationId")
	private int certificationId;

	@Column(name = "certificationTitle")
	String certificationTitle;

	@Column(name = "CertificationType")
	String CertificationType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private EmployeeDto employee;

	public CertificationDto() {
		super();
	}

	public CertificationDto(String certificationTitle, String certificationType) {
		super();
		this.certificationTitle = certificationTitle;
		CertificationType = certificationType;
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
		return CertificationType;
	}

	/**
	 * @param certificationType the certificationType to set
	 */
	public void setCertificationType(String certificationType) {
		CertificationType = certificationType;
	}

	/**
	 * @return the employee
	 */
	public EmployeeDto getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CertificationDto [certificationId=" + certificationId + ", certificationTitle=" + certificationTitle
				+ ", CertificationType=" + CertificationType + ", employee=" + employee + "]";
	}

}
