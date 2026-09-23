package com.example.dentalboard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dentalboard.service.HeaderService;

@Controller
public class PatientController {

    @Autowired
    private HeaderService headerService;

    @GetMapping("/patients")
    public String patients(
            @AuthenticationPrincipal UserDetails userDetails,
            Model model) {

        // ヘッダーに必要なデータ
        model.addAllAttributes(
                headerService.getHeaderData(null, userDetails)
        );

        // 仮の患者データ
        List<Map<String, String>> patients = List.of(

            Map.of(
                "patientNumber", "P0101",
                "name", "田中 花子",
                "gender", "女性",
                "birthday", "1985/04/12",
                "lastVisit", "2026/08/08",
                "memo", "メンテナンス"
            ),

            Map.of(
                "patientNumber", "P0102",
                "name", "山田 太郎",
                "gender", "男性",
                "birthday", "1978/11/03",
                "lastVisit", "2026/07/15",
                "memo", "SRP"
            ),

            Map.of(
                "patientNumber", "P0103",
                "name", "佐藤 美咲",
                "gender", "女性",
                "birthday", "1990/06/28",
                "lastVisit", "2026/06/20",
                "memo", "検査"
            )
        );

        model.addAttribute("patients", patients);

        model.addAttribute("page", "patients");

        return "index";
    }
}