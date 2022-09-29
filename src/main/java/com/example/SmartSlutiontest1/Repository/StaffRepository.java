package com.example.SmartSlutiontest1.Repository;


import com.example.SmartSlutiontest1.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, String> {
    @Query("SELECT s.staff FROM Authority s WHERE s.role.id IN ('DIRE','STAF')")
    List<Staff> getAdmin();

    /*@Query(value = "SELECT s.departments FROM Staff s WHERE s.StaffID = :user", nativeQuery = true)
    List<Department> finddepartment(@Param("user") String user);*/
}
