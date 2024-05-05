package com.EasySaty.STAY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactRepo extends JpaRepository<Contact,Integer> {
    
}
