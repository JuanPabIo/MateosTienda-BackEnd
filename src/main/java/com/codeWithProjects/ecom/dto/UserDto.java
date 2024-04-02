package com.codeWithProjects.ecom.dto;

import com.codeWithProjects.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}
