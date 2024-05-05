package com.EasySaty.STAY;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
public class Owner {
    
    @Id
    private String userid;
    private String name;
    private String type;




}
