package com.zyratechnologies.jwtproject1.dtos;

import com.zyratechnologies.jwtproject1.enums.Role;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ResponseDto {

    private String fullName;

    private String userName;

    private String email;

    private String password;

    private Role role;


    private LocalDate createdAt;

    private LocalDate updatedAt;
}
