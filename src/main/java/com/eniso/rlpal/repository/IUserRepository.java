package com.eniso.rlpal.repository;

import com.eniso.rlpal.dto.UserDto;
import com.eniso.rlpal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);
    Optional<UserDto> save(UserDto dto) ;
}
