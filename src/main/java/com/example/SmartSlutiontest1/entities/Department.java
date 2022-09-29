package com.example.SmartSlutiontest1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentid")
    Integer id;
    String departmentname;
    @JsonIgnore
    @OneToMany(mappedBy = "departments")
    List<Staff> staff;
}
