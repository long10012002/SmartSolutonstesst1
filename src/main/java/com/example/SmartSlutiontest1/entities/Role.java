package com.example.SmartSlutiontest1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Roles")
public class Role implements Serializable {
    @Id
    @Column(name = "roleid")
    private String Id;
    private String RoleName;
    @JsonIgnore
    @OneToMany(mappedBy = "role")
    List<Authority> authorities;
}
