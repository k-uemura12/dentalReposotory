package com.example.dentalboard.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class HeaderService {

    public Map<String, Object> getHeaderData(LocalDate targetDate, UserDetails userDetails) {
        LocalDate today = LocalDate.now();
        if (targetDate == null) {
            targetDate = today;
        }

        boolean isToday = targetDate.equals(today);
        LocalDate prevDate = targetDate.minusDays(1);
        LocalDate nextDate = targetDate.plusDays(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy'年'M'月'd'日' '('E')'", Locale.JAPANESE);
        String formattedDate = targetDate.format(formatter);

        Map<String, Object> headerData = new HashMap<>();
        headerData.put("currentDate", targetDate.toString());
        headerData.put("displayDate", formattedDate);
        headerData.put("prevDate", prevDate.toString());
        headerData.put("nextDate", nextDate.toString());
        headerData.put("isToday", isToday);
        headerData.put("staffName", (userDetails != null) ? "上村佳奈" : "管理者");

        return headerData;
    }
}