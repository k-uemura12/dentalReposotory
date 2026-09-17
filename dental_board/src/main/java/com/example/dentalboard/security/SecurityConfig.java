package com.example.dentalboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                // CSSやJSなどの静的ファイルはログインなしで許可
                .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()
                // 管理者専用ページ（例: /admin/配下）は ROLE_ADMIN のみアクセス許可
                .requestMatchers("/admin/**").hasRole("ADMIN")
                // それ以外のページはログイン済みであればアクセス許可
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")              // ログイン画面のURL
                .loginProcessingUrl("/login")      // ログインフォームの送信先URL
                .usernameParameter("staff_id")   // フォームの入力項目名（<input name="staffId">）
                .passwordParameter("password")     // フォームの入力項目名（<input name="password">）
                .defaultSuccessUrl("/", true)      // ログイン成功時の遷移先
                .failureUrl("/login?error")        // ログイン失敗時の遷移先
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")              // ログアウト処理のURL
                .logoutSuccessUrl("/login?logout")  // ログアウト成功時の遷移先
                .permitAll()
            );

        return http.build();
    }

    // パスワードの暗号化（BCrypt）に使用するBean定義
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}