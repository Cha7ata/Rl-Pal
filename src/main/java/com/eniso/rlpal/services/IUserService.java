package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> findAll();

    UserDto findById(Integer id);

    UserDto save(UserDto dto);
}

