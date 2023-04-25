package com.eniso.rlpal.services.implementation;

import com.eniso.rlpal.dto.UserDto;
import com.eniso.rlpal.exception.EntityNotFoundException;
import com.eniso.rlpal.exception.ErrorMessages;
import com.eniso.rlpal.exception.InvalidOperationException;
import com.eniso.rlpal.model.User;
import com.eniso.rlpal.repository.IUserRepository;
import com.eniso.rlpal.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper
                        .map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findById(Integer id) {

        return userRepository.findById(id).map((user -> modelMapper.map(user, UserDto.class))).orElseThrow(
                () -> new EntityNotFoundException("user not found")
        );
    }

    @Override
    public UserDto save(UserDto dto) {
        return null;
    }
}
