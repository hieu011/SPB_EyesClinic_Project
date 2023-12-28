package com.codegym.spb_eyesclinic_project.repository;

import com.codegym.spb_eyesclinic_project.domain.Customer;
import com.codegym.spb_eyesclinic_project.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepository  extends JpaRepository<Staff, Long> {

//    Optional<Staff> findStaffByNumberPhone(String phoneNumber);
//    boolean existsByNumberPhone(String numberPhone);
}
