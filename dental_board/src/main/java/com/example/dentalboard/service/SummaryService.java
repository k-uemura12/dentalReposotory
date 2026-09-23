package com.example.dentalboard.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    public Map<String, Object> getSummaryData(LocalDate targetDate) {

        if (targetDate == null) {
            targetDate = LocalDate.now();
        }

        Map<String, Object> summaryData = new HashMap<>();

        // 仮のサマリーデータ
        int totalAppointments = 10;
        int completedAppointments = 3;
        int remainingAppointments = 7;

        // 予約人数
        summaryData.put("todayReservationCount", totalAppointments);

        // 実施済み
        summaryData.put("completedCount", completedAppointments);

        // 未実施
        summaryData.put("incompleteCount", remainingAppointments);

        // 実施率
        int completedRate =
                totalAppointments == 0
                ? 0
                : completedAppointments * 100 / totalAppointments;

        // 未実施率
        int incompleteRate =
                totalAppointments == 0
                ? 0
                : remainingAppointments * 100 / totalAppointments;

        summaryData.put("completedRate", completedRate);
        summaryData.put("incompleteRate", incompleteRate);

        return summaryData;
    }
}