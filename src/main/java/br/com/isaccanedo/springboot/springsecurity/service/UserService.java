package br.com.isaccanedo.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.isaccanedo.springboot.springsecurity.model.User;
import br.com.isaccanedo.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
