package com.codegym.spb_eyesclinic_project.domain.dto.userDTO;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserSaveRequest {


    private String fullName;

    private String phoneNumber;

    private String role;

    private String password;
}
