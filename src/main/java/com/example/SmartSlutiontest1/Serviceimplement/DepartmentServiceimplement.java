package com.example.SmartSlutiontest1.Serviceimplement;

import com.example.SmartSlutiontest1.Repository.DepartmentRepository;
import com.example.SmartSlutiontest1.Repository.StaffRepository;
import com.example.SmartSlutiontest1.entities.Department;
import com.example.SmartSlutiontest1.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceimplement implements DepartmentService {
    @Autowired
    DepartmentRepository departmentrepository;

    @Override
    public List<Department> findAll() {
        return departmentrepository.findAll();
    }

    @Override
    public Optional<Department> findById(Integer id) {
        return departmentrepository.findById(id);
    }

    @Override
    public Department create(Department department) {
        return departmentrepository.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentrepository.save(department);
    }

    @Override
    public void delete(Integer id) {
        departmentrepository.deleteById(id);
    }
}
