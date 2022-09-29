package com.example.SmartSlutiontest1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Staffs")
public class Staff implements Serializable {
    @Id
    @Column(name = "staffid")
    String Staffid;
    String Pass;
    String Staffname;
    String Phonenumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    Date birtday = new Date();
    String degree;
    @ManyToOne
    @JoinColumn(name = "departmentid")
    Department departments;

    @JsonIgnore
    @OneToMany(mappedBy = "staff")
    List<Authority> authorities;

    @JsonIgnore
    @OneToMany(mappedBy = "staff")
    List<Syslog> syslogs;

}
