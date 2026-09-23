package com.example.dentalboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dentalboard.service.HeaderService;

@Controller
public class ReservationController {

    @Autowired
    private HeaderService headerService;

    @GetMapping("/reservations")
    public String reservations(
            @AuthenticationPrincipal UserDetails userDetails,
            Model model) {

        // ヘッダーに必要なデータ
        model.addAllAttributes(
                headerService.getHeaderData(null, userDetails)
        );

        // 予約画面であることをindex.htmlに伝える
        model.addAttribute("page", "reservations");

        return "index";
    }
}