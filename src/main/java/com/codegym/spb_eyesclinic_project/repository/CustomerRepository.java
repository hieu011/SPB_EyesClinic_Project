package com.codegym.spb_eyesclinic_project.repository;


import com.codegym.spb_eyesclinic_project.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    Optional<Customer> findCustomerByNumberPhone(String phoneNumber);
//    boolean existsByNumberPhoneIgnoreCase(String phoneNumber);
//    boolean existsByNumberPhone(String numberPhone);


}
