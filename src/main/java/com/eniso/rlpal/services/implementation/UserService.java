package com.eniso.rlpal.services.implementation;

import com.eniso.rlpal.dto.UserDto;
import com.eniso.rlpal.repository.IUserRepository;
import com.eniso.rlpal.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }

    @Override
    public UserDto save(UserDto dto) {
        return null;
    }
}
