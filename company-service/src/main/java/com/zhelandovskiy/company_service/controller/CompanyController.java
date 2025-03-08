package com.zhelandovskiy.company_service.controller;

import com.zhelandovskiy.company_service.dto.CompanyCreateUpdateDto;
import com.zhelandovskiy.company_service.service.CompanyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import service.company.CompanyDto;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @Value("${spring.datasource.url}")
    public  String url;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyDto> getAllCompanies() {
        System.out.println("url = " + url);
        return companyService.getAllCompanies();
    }

    @GetMapping("/{name}")
    public CompanyDto findByName(@PathVariable String name) {
        return companyService.findByName(name);
    }

    @GetMapping("/user/{id}")
    public CompanyDto findByEmployee(@PathVariable Long id) {
        return companyService.findByEmployeeId(id);
    }

    @PostMapping
    public CompanyDto createCompany(@RequestBody CompanyCreateUpdateDto dto) {
        return companyService.createCompany(dto);
    }

}