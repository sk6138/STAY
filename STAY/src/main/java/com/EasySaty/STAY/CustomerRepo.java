package com.EasySaty.STAY;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String>{

    List<Customer> findByName(String name);
    List<Customer> findByUserid(String userid);

}
