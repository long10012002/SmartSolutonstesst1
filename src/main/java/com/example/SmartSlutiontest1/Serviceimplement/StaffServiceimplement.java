package com.example.SmartSlutiontest1.Serviceimplement;

import com.example.SmartSlutiontest1.Repository.StaffRepository;
import com.example.SmartSlutiontest1.entities.Staff;
import com.example.SmartSlutiontest1.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceimplement implements StaffService, UserDetailsService {
    @Autowired
    StaffRepository staffrepository;
//    @Autowired
//    PasswordEncoder bcryptEncoder;
    @Override
    public List<Staff> findAll() {
        return staffrepository.findAll();
    }

    @Override
    public Staff findById(String id) {
        return staffrepository.findById(id).get();
    }

    @Override
    public List<Staff> getAdmin() {
        return staffrepository.getAdmin();
    }

    @Override
    public Staff create(Staff staff) {
        return staffrepository.save(staff);
    }

    @Override
    public Staff update(Staff staff) {
        return staffrepository.save(staff);
    }



    @Override
    public void delete(String id) {
        staffrepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String staffid) throws UsernameNotFoundException {
        Optional<Staff> staff = staffrepository.findById(staffid);
        //DAOUser user = userDao.findByUsername(username);
        if (staff == null) {
            throw new UsernameNotFoundException("User not found with username: " + staffid);
        }
        return new org.springframework.security.core.userdetails.User(staff.get().getStaffid(), staff.get().getPass(),
                new ArrayList<>());
    }

//    public Staff save(Staff staff) {
//        Staff newStaff = new Staff();
//        newStaff.setStaffid(staff.getStaffid());
//        newStaff.setPass(bcryptEncoder.encode(staff.getPass()));
//        return staffrepository.save(newStaff);
//    }
}
