package com.EasySaty.STAY;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner,String>{

    List<Owner> findByType(String type);

}
