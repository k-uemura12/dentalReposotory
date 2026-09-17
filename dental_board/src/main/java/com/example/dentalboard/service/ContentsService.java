package com.example.dentalboard.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dentalboard.entity.Appointment;
import com.example.dentalboard.repository.AppointmentRepository;

@Service
public class ContentsService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAppointments(LocalDate targetDate) {
        // targetDate が null（初期表示時）の場合は「今日の日付」をセットする安全対策
        if (targetDate == null) {
            targetDate = LocalDate.now();
        }
        
        // DBから指定された日付のデータを検索して返す
        return appointmentRepository.findByAppointmentDateOrderByAppointmentTimeAsc(targetDate);
    }
}