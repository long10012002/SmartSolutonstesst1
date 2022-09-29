package com.example.SmartSlutiontest1.services;

import com.example.SmartSlutiontest1.entities.Department;
import com.example.SmartSlutiontest1.entities.Staff;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> findAll();

    Optional<Department> findById(Integer id);

    Department create(Department department);
    Department update(Department department);
    void delete(Integer id);
}
