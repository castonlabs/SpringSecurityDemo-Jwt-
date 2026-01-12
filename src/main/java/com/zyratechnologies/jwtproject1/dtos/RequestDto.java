package com.zyratechnologies.jwtproject1.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class RequestDto {

    private String fullName;

    @NotBlank(message = "user-name is required")
    @Column(nullable = false)
    @Size(min = 3,max = 10)
    private String userName;


    @Email( message = "the email must have the correct fomat")
    @Column(nullable = false)
    @NotBlank( message = "the email field is required")
    private String email;

    @NotBlank(message = "password is required")
    @Column(nullable = false)
    @Size(min = 3)
    private String password;
}
