package com.example.dentalboard.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dentalboard.service.ContentsService;
import com.example.dentalboard.service.HeaderService;
import com.example.dentalboard.service.SummaryService;

@Controller
public class DashboardController {

    // 各専門サービスを注入
    @Autowired
    private HeaderService headerService;

    @Autowired
    private SummaryService summaryService;

    @Autowired
    private ContentsService contentsService;

    @GetMapping("/")
    public String index(
            @RequestParam(name = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate targetDate,
            @AuthenticationPrincipal UserDetails userDetails, 
            Model model) {

        // 1. ヘッダー情報の取得とセット（日付計算・表示フォーマット・ユーザー名）
        model.addAllAttributes(headerService.getHeaderData(targetDate, userDetails));

        // 2. サマリー情報の取得とセット（予約件数・実施済み・未実施）
        model.addAllAttributes(summaryService.getSummaryData(targetDate));

        // 3. 診療一覧情報の取得とセット（指定日のデータのみを取得）
        model.addAttribute("appointments", contentsService.getAppointments(targetDate));

        return "index";
    }
}