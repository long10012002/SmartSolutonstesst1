package com.example.SmartSlutiontest1.services;

import com.example.SmartSlutiontest1.entities.Staff;

import java.util.List;

public interface StaffService{
    List<Staff> findAll();

   Staff findById(String id);

    List<Staff> getAdmin();

    Staff create(Staff staff);
    Staff update(Staff staff);
    void delete(String id);
}
