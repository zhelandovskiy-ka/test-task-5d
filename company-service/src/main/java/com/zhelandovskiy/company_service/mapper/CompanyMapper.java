package com.zhelandovskiy.company_service.mapper;

import com.zhelandovskiy.company_service.dto.CompanyCreateUpdateDto;
import com.zhelandovskiy.company_service.entity.CompanyEntity;
import org.mapstruct.Mapper;
import service.company.CompanyDto;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CompanyDto toDto(CompanyEntity userEntity);

    CompanyEntity toEntity(CompanyCreateUpdateDto dto);

}