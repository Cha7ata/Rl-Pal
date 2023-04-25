package com.eniso.rlpal.services.auth;


import com.eniso.rlpal.dto.UserDto;
import com.eniso.rlpal.model.auth.ExtendedUser;
import com.eniso.rlpal.services.IUserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    private final IUserService service;

    public ApplicationUserDetailsService(IUserService service) {
        this.service = service;
    }


    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Integer x=Integer.parseInt(id);
        UserDto utilisateur = service.findById(x);

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        return new ExtendedUser(utilisateur.getEmail(),utilisateur.getPassword(),authorities);
    }
}
