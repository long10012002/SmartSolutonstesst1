package com.example.SmartSlutiontest1.controllers;

import com.example.SmartSlutiontest1.entities.Staff;
import com.example.SmartSlutiontest1.services.DepartmentService;
import com.example.SmartSlutiontest1.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffService staffservice;

    @Autowired
    DepartmentService departmentService;

    @GetMapping()
    public List<Staff> getAll(){
        return staffservice.findAll();
    }
    @GetMapping("/getOne/{username}")
    public Staff getOne(@PathVariable("username") String username){
        return staffservice.findById(username);
    }
    @PostMapping("/create")
    public Staff create(@RequestBody Staff staff){
        staff.setDepartments(departmentService.findById(3).get());
        return staffservice.create(staff);
    }
    @PutMapping("{id}")
    public Staff update(@PathVariable("id") String id,@RequestBody Staff staff){
        return staffservice.update(staff);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        staffservice.delete(id);
    }
}
