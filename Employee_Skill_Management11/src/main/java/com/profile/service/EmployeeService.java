package com.profile.service;

import java.util.List;

import javax.validation.Valid;

import com.profile.CustomException.RecordNotFoundException;
import com.profile.dto.EmpSkillDto;
import com.profile.dto.EmployeeDto;
import com.profile.model.CertificationList;
import com.profile.model.Employee;
import com.profile.model.SkillList;
import com.profile.model.Skills;

public interface EmployeeService {

	Object save(EmployeeDto employee);

	String sendMail(String to, boolean response);

	EmployeeDto addEmpskill(int id, SkillList skillList) throws RecordNotFoundException;

	List<EmployeeDto> getAllEmp();

	EmployeeDto getEmpById(int id) throws RecordNotFoundException;

	Employee deleteEmp(int id) throws RecordNotFoundException;

	EmployeeDto updateEmpSkill(int id, String skill_name, Skills skill) throws RecordNotFoundException;

	String authenticate(Employee employee);

	EmployeeDto updateEmpSkillSet(int id, SkillList skillList) throws RecordNotFoundException;

	EmpSkillDto deleteEmpSkillData(int id, int skillid);

	EmployeeDto addEmpCertifications(int id, CertificationList certificationList) throws RecordNotFoundException;

}
