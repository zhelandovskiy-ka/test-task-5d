package com.zhelandovskiy.company_service.service;

import com.zhelandovskiy.company_service.dto.CompanyCreateUpdateDto;
import service.company.CompanyDto;

import java.util.List;

public interface CompanyService {

    List<CompanyDto> getAllCompanies();

    CompanyDto findByName(String name);

    CompanyDto createCompany(CompanyCreateUpdateDto dto);

    CompanyDto findByEmployeeId(Long employeeId);

}