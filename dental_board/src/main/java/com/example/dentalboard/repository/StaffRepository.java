//ログイン時に受け取ったstaffIdを使ってStaff Entityを検索し、検索結果を Optional<Staff> として返すRepository。
package com.example.dentalboard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dentalboard.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
//自分で作ったRepository　JpaRepositoryの機能を引き継ぐ　扱うEntity　主キーの型　　　　　　　　
	
	// ログイン処理時に staffIdでスタッフを検索する
    
	//どのような条件で検索するかをJPQLで指定する
	@Query("SELECT s FROM Staff s WHERE s.staffId = :staffId")
	//staffを取得する　StaffEntityを検索対象にする　ここから検索条件　StaffクラスのStaffId＝メソッドに渡されたStaffId
	Optional<Staff>findByStaffId(String staffId);
    //（戻り値の型）Staffが見つかる場合・見つからない場合の両方を扱える　　メソッド名　　引数
    //String型のstaffIdを受け取る staffIdを使ってStaffを検索する
}