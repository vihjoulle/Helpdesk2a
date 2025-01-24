package br.com.victoroliveira.userserviceapi.service;

import br.com.victoroliveira.userserviceapi.entity.User;
import br.com.victoroliveira.userserviceapi.mapper.UserMapper;
import br.com.victoroliveira.userserviceapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import models.responses.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse findById(final String id) {

        return userMapper.fromEntity(userRepository.findById(id).orElse(null));
     //   return userRepository.findById(id).orElse(null);
    }
}
