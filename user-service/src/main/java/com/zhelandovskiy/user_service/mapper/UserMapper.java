package com.zhelandovskiy.user_service.mapper;

import com.zhelandovskiy.user_service.dto.UserCreateUpdateDto;
import com.zhelandovskiy.user_service.entity.UserEntity;
import org.mapstruct.Mapper;
import service.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(UserEntity userEntity);

    UserEntity toEntity(UserCreateUpdateDto dto);
}