package com.profile.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.Repository.CertificationRepo;
import com.profile.Repository.EmpSkillRepo;
import com.profile.Repository.EmployeeReo;
import com.profile.dto.CertificationDto;
import com.profile.dto.EmpSkillDto;
import com.profile.dto.EmployeeDto;
import com.profile.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	EmpSkillRepo empSkillRepo;

	@Autowired
	EmployeeReo employeeReo;

	@Autowired
	CertificationRepo certificationRepo;
	/**
	 * 
	 * @param skillname
	 * @return employee details
	 * @Discription Returns all employee details with specified skill
	 */
	@Override
	public List<EmployeeDto> getAllEmpBySkillName(String skillname, String expOrder) {

		List<EmpSkillDto> empSkillDtoList = new ArrayList<EmpSkillDto>();
		if(expOrder.equalsIgnoreCase("Asc"))	
		empSkillDtoList = empSkillRepo.findBySkillNameOrderByExperianceAsc(skillname);
		
		else
			empSkillDtoList = empSkillRepo.findBySkillNameOrderByExperianceDesc(skillname);
		
		List<EmployeeDto> employeeList = new ArrayList<EmployeeDto>();
		for (EmpSkillDto employeeSkillObject : empSkillDtoList) {
			EmployeeDto employee = employeeReo.findById(employeeSkillObject.getEmployee().getId());
			employeeList.add(employee);
		}
		
		/*
		 * if(expOrder.equalsIgnoreCase("DESC")) Collections.sort( employeeList);
		 */
		
		return employeeList;
	}

	@Override
	public List<EmployeeDto> getEmpbyCertification(String certificationTitle) {
		List<CertificationDto> certificationDtoList = certificationRepo.findBycertificationTitle(certificationTitle);
		List<EmployeeDto> employeeList = new ArrayList<EmployeeDto>();
		for (CertificationDto employeeCertification : certificationDtoList) {
			EmployeeDto employee = employeeReo.findById(employeeCertification.getEmployee().getId());
			employeeList.add(employee);
		}
		return employeeList;
	}
}
