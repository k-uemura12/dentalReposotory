package com.example.dentalboard.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment_db")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    @Column(name = "appointment_time")
    private LocalTime appointmentTime;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "is_inspected")
    private Boolean isInspected;      // 検査 (true/false)

    @Column(name = "is_panorama")
    private Boolean isPanorama;       // パノラマ (true/false)

    @Column(name = "is_splint")
    private Boolean isSplint;         // スプリント調整 (true/false)

    @Column(name = "is_extra_points")
    private Boolean isExtraPoints;   // 追加点数 (true/false)

    private String memo;              // メモ

    @Column(name = "is_completed")
    private Boolean isCompleted;
    
    // --- ゲッター / セッター ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(LocalDate appointmentDate) { this.appointmentDate = appointmentDate; }

    public LocalTime getAppointmentTime() { return appointmentTime; }
    public void setAppointmentTime(LocalTime appointmentTime) { this.appointmentTime = appointmentTime; }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }
   
    public Boolean getIsInspected() { return isInspected; }
    public void setIsInspected(Boolean isInspected) { this.isInspected = isInspected; }

    public Boolean getIsPanorama() { return isPanorama; }
    public void setIsPanorama(Boolean isPanorama) { this.isPanorama = isPanorama; }

    public Boolean getIsSplint() { return isSplint; }
    public void setIsSplint(Boolean isSplint) { this.isSplint = isSplint; }

    public Boolean getIsExtraPoints() { return isExtraPoints; }
    public void setIsExtraPoints(Boolean isExtraPoints) { this.isExtraPoints = isExtraPoints; }

    public String getMemo() { return memo; }
    public void setMemo(String memo) { this.memo = memo; }

    public Boolean getIsCompleted() { return isCompleted; }
    public void setIsCompleted(Boolean isCompleted) { this.isCompleted = isCompleted; }
    

}

