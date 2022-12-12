package com.experion.mainbackend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "role")
public class Role {
    
    @Column(name = "id")
    private Integer id;

    @Column(name = "rolename")
    private String roleName;
}
