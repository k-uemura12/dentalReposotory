//DBの roles テーブルとJavaの Role クラスを対応させるクラス
package com.example.dentalboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

//このクラスはDBのテーブルと対応するEntityであることを伝える
@Entity
//DBのrolesテーブルと対応
@Table(name = "roles")
// Lombokの機能。getId()やgetName()などを用意してくれる
@Data
public class Role {
    
	//この項目が主キー
    @Id
    //idの採番はDB側のAUTO_INCREMENTに任せる
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   //JavaのidとＤＢのidカラムを対応させる
    @Column(name = "id")
    private Integer id;
   //このクラス内から　型　変数名　
    
    // ROLE_ADMIN や ROLE_GENERAL などが入るカラム
    @Column(name = "name", nullable = false, unique = true)
    //DBの「name」カラムと対応　nullは禁止、　重複は禁止
    
    //ROLE_ADMINやROLE_GENERALなどのRole名を保持する
    private String name;
    //このクラス内から　文字列型　変数名
}