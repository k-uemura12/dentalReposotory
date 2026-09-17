package com.example.dentalboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // ログイン画面を表示するだけ（日付などの余計なデータは渡さない）
    }
}