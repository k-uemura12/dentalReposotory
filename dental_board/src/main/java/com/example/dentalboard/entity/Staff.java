package com.example.dentalboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "staffs")
@Data
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "staff_id", nullable = false, unique = true)
    private String staffId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "staff_name")
    private String staffName;

    // Roleテーブルの結合条件を設定
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "name") 
    private Role role;
}