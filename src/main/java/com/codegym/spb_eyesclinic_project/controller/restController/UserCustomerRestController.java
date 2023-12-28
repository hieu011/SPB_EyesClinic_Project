package com.codegym.spb_eyesclinic_project.controller.restController;


import com.codegym.spb_eyesclinic_project.service.customer.CustomerService;
import com.codegym.spb_eyesclinic_project.domain.dto.userDTO.UserSaveRequest;
import com.codegym.spb_eyesclinic_project.service.userService.UserService;
import com.codegym.spb_eyesclinic_project.domain.dto.userDTO.UserListResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserCustomerRestController {

    @Autowired
    private UserService userService;

    private CustomerService customerService;


    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<UserListResponse> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public void createUser(@RequestBody UserSaveRequest request) {
        userService.createUser(request);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
