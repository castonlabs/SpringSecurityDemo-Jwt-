package com.zyratechnologies.jwtproject1.service;

import com.zyratechnologies.jwtproject1.dtos.RequestDto;
import com.zyratechnologies.jwtproject1.dtos.ResponseDto;

public interface UserServiceInterf {
    ResponseDto registerUser(RequestDto request);
}
