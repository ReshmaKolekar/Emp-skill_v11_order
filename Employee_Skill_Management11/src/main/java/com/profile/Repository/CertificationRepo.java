package com.profile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.dto.CertificationDto;
import com.profile.dto.SkillDto;
import com.sun.xml.bind.v2.model.core.ID;

public interface CertificationRepo extends JpaRepository<CertificationDto, ID> {

	public List<CertificationDto> findBycertificationTitle(String certificationTitle);

}
