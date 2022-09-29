package com.example.SmartSlutiontest1.entities;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
@Entity
@Builder
@ToString
@Table(name = "Syslog")
public class Syslog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    String Creator;
    @Temporal(TemporalType.DATE)
    @Column(name = "createdate")
    Date Createdate = new Date();
    String Act;
    @ManyToOne(optional=false)
    @JoinColumn(name = "staffid",insertable=false, updatable=false)
    Staff staff;
}
