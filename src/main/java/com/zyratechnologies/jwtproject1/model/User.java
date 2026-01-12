package com.zyratechnologies.jwtproject1.model;

import com.zyratechnologies.jwtproject1.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @NotBlank(message = "full-name is required")
    @Column(nullable = false)
    @Size(min = 3,max = 10)
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

    @Enumerated(EnumType.STRING)
    private Role role;

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;
}
