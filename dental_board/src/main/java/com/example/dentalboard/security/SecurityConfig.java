package com.example.dentalboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//Springの設定を行うクラスであることを示す
@Configuration

//Spring Securityを有効にする
@EnableWebSecurity
public class SecurityConfig {
    
	//Spring Securityのセキュリティ設定を登録する
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//他のクラスからアクセス可能 戻り値の型　メソッド名　引数HttpSecurity型のhttpを受け取る　処理中にException（例外）が発生する可能性があることを宣言       
    	http
                //URLごとに「誰がアクセスできるか」を設定
            .authorizeHttpRequests(auth -> auth
                // CSSやJS・画像などの静的ファイルはログインなしでアクセス可能
                .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()
                // ※未実装※管理者専用ページ（例: /admin/配下）は ROLE_ADMIN のみアクセス許可
                .requestMatchers("/admin/**").hasRole("ADMIN")
                // それ以外のページはログイン済みであればアクセス許可
                .anyRequest().authenticated()
            )
            //ログインに関する設定
            .formLogin(form -> form
                .loginPage("/login")              // ログイン画面のURL
                .loginProcessingUrl("/login")      // ログインフォームからID・PWを送信するURL
                                                  //この認証処理はControllerではなくSpring　Securityが行う               
                .usernameParameter("staff_id")   //ユーザーIDとして受け取るinputのname属性 
                .passwordParameter("password")     // パスワードとして受け取るinputのname属性
                .defaultSuccessUrl("/", true)      // 認証成功後はトップ画面「/」へ移動
                .failureUrl("/login?error")        // 認証失敗時はログイン画面へ戻す
                .permitAll()                       //ログイン画面へのアクセスはログインいなくても許可
            )
            //ログアウトに関する設定
            .logout(logout -> logout
            		//ログアウト処理を行うURL
                .logoutUrl("/logout")              
                // ログアウト成功後はログイン画面へ移動
                .logoutSuccessUrl("/login?logout")  
               
                .permitAll()
            );
  //上記の設定をもとにSecurityFilterChainを作成してSpringに返す
  //http にここまで設定してきた内容を build() で完成させ、SecurityFilterChain としてreturnする 
    			return http.build();
    		}

 // パスワードの照合などで使用するPasswordEncoderをSpringに登録
    @Bean
    public PasswordEncoder passwordEncoder() {
//他のクラスからアクセス可能　戻り値の型　メソッド名　引数なし    
    	// BCrypt方式を使用する
        return new BCryptPasswordEncoder();
    }
}

/*
password123のような生パスワードではなく、Bcryptでハッシュ化されたものを使う
ログイン画面で入力されたパスワードと、DBに保存されたハッシュ値をSpring Securityが照合するために
PasswordEncoderをつかう。
管理者画面はまだ作っていない。DBにあるID「DH001」は管理者用として登録
*/