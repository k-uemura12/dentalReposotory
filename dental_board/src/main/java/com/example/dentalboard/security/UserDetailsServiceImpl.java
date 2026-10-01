//ログインIDを使ってDBからスタッフ情報を取得し、Spring Securityが認証に使える形にして返す
 
package com.example.dentalboard.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.dentalboard.entity.Staff;
import com.example.dentalboard.repository.StaffRepository;

//このクラスはServiceとしてSpringに管理してもらう
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 //StaffRepositoryをこのServiceで使うための変数を準備
    private final StaffRepository staffRepository;
 //このクラスの中から使用　一度設定したstaffRepositoryを基本的に別のものに入れ替えない　型　変数名
 
    //コンストラクタ　SpringがUserDetailServiceImplを作るときに、必要なStaffRepositoryを渡してくれる。
    public UserDetailsServiceImpl(StaffRepository staffRepository) {
    	//他のクラスからも呼び出せる　コンストラクタ名　引数の型　引数の変数名（引数としてこの名前でコンストラクタから使える）
        this.staffRepository = staffRepository;
        // このクラスが持つ変数　コンストラクタの引数として受け取った変数
    }
    //メソッド（関数の定義）String型のstaffIdを受け取って、最終的にUserDetail型のデータを返すメソッド
    @Override
    public UserDetails loadUserByUsername(String staffId) throws UsernameNotFoundException {
  //他のクラスから呼び出せる　戻り値の型　メソッド名　引数の型　引数名　スタッフが見つからない場合、この例外が発生する可能性がある
    

       //「DH001のスタッフを探してください」とRepositoryに依頼する   	
        Staff staff = staffRepository.findByStaffId(staffId)
      //型  変数名     StaffRepositoryのfindByStaffIdメソッドを呼ぶ
                .orElseThrow(() -> {
                //ラムダ式　スタッフが見つからなかったら例外を発生させる
                    return new UsernameNotFoundException("該当するスタッフが見つかりません: " + staffId);
                });
                

     //ROLE_ADMINなどの権限を入れておくためのリストを作っている
        Collection<GrantedAuthority> authorities = new ArrayList<>();
       //GrantedAuthority型のデータを複数扱うための型 変数名　空のArrayListを新しくつくる
        if (staff.getRole() != null) {
        	//staffのRoleがnull（値が存在しない）!=(ではない）　Roleが存在するなら処理を実行する
            authorities.add(new SimpleGrantedAuthority(staff.getRole().getName()));
         // staffからRoleを取得 → Roleの名前（例：ROLE_ADMIN）を取得
         // そのRole名をSpring Securityが扱える権限に変換し、authoritiesに追加する
        }
        // DBから取得したStaff情報を、
        // Spring Securityが認証に使用できるUserDetailsとして返す
        return new User(
                staff.getStaffId(),
                staff.getPassword(),
                authorities
        );
    }
}