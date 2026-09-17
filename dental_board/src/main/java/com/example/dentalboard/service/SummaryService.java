package com.example.dentalboard.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    // ★ このメソッドが必要です
    public Map<String, Object> getSummaryData(LocalDate targetDate) {
        if (targetDate == null) {
            targetDate = LocalDate.now();
        }

        Map<String, Object> summaryData = new HashMap<>();
        
        // 仮のサマリーデータ（必要に応じてDB等のロジックへ変更）
        summaryData.put("totalAppointments", 10); // 総予約数
        summaryData.put("completedAppointments", 3); // 完了数
        summaryData.put("remainingAppointments", 7); // 未実施数

        return summaryData;
    }
}