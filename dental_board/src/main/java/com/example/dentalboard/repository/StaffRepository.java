package com.example.dentalboard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dentalboard.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    // ログイン処理時に staffIdでスタッフを検索する
    Optional<Staff>findByStaffId(String staffId);
}