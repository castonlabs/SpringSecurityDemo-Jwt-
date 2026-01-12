package com.zyratechnologies.jwtproject1.service;

import com.zyratechnologies.jwtproject1.dtos.RequestDto;
import com.zyratechnologies.jwtproject1.dtos.ResponseDto;
import com.zyratechnologies.jwtproject1.exceptions.UserAlreadyExistException;
import com.zyratechnologies.jwtproject1.model.User;
import com.zyratechnologies.jwtproject1.repository.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceImpl implements UserServiceInterf{
    private final UserRepository userRepository;

    public ResponseDto registerUser(RequestDto request) {

        if(userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistException("this user alresdy exists");
        }
        User savedUser = userRepository.save(convertToEntity(request));
        return convertToDto(savedUser);

    }

    public User convertToEntity(RequestDto request){
        return User.builder()
                .fullName(request.getFullName())
                .userName(request.getUserName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

    }

    public ResponseDto convertToDto(User user) {
        return ResponseDto.builder()
                .fullName(user.getFullName())
                .userName(user.getUserName())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }

}


