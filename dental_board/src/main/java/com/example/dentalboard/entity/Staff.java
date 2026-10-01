//DBの staffs テーブルと、Javaの Staff クラスを対応させるクラス
package com.example.dentalboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

//DBのテーブルと対応するEntity
@Entity
//DBのstaffsテーブルと対応
@Table(name = "staffs")
//Lombokがgetter・setterなどを自動で用意
@Data
public class Staff {
    
	
	//主キー
    @Id
    //IDの採番はDBのAUTO_INCREMENTに任せる
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //DBのidカラムと対応
    @Column(name = "id")
    private Integer id;
    //Integer型のidというフィールド
    
   // DH001 などが入るカラム
    @Column(name = "staff_id", nullable = false, unique = true)
    private String staffId;
   //DBの「staff_id」カラムと対応　nullは禁止、　重複は禁止

    
    @Column(name = "password", nullable = false)
    private String password;
  //DBの「password」カラムと対応　nullは禁止
    
    @Column(name = "staff_name")
    private String staffName;
  //DBの「staff_name」カラムと対応
  
   
    // Roleテーブルの結合条件を設定
    //複数のStaffが、１つのRoleに所属できる
    @ManyToOne
    //staffsテーブルの role と、rolesテーブルの name を使って関連付ける
    @JoinColumn(name = "role", referencedColumnName = "name") 
    private Role role;
}