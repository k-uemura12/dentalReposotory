package com.example.dentalboard.controller;

//Spring MVCで、このクラスをControllerとして扱うために必要
import org.springframework.stereotype.Controller;
//URLへのGETリクエストと、実行するメソッドを紐づけるために必要
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

	// [/login]にGETでアクセスされたとき、loginメソッドを実行する
    @GetMapping("/login")
    public String login() {
 //公開範囲 戻り値 メソッド名 引数
    	
        // templatesフォルダ内のlogin.htmlを表示する    	
        return "login"; // ログイン画面を表示するだけ（日付などの余計なデータは渡さない）
    }
}
/*ブラウザ
↓
GET /login
↓
@GetMapping("/login")
↓
login() メソッド実行
↓
return "login"
↓
templates/login.html
↓
ログイン画面表示するだけ※ID・PWの認証はSecurityConfigが担当
*/