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

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final StaffRepository staffRepository;

    public UserDetailsServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String staffId) throws UsernameNotFoundException {
        // ★1. フォームから送信されたIDの確認
        System.out.println("========== [DEBUG] 1. ログイン処理開始: フォーム送信ID = [" + staffId + "] ==========");

        Staff staff = staffRepository.findByStaffId(staffId)
                .orElseThrow(() -> {
                    System.out.println("========== [DEBUG] エラー: ID [" + staffId + "] がDBに見つかりません ==========");
                    return new UsernameNotFoundException("該当するスタッフが見つかりません: " + staffId);
                });

        // ★2. DBから取得したハッシュ値の確認
        System.out.println("========== [DEBUG] 2. DB取得成功: 名前 = " + staff.getStaffName() + " ==========");
        System.out.println("========== [DEBUG] 3. DBのハッシュ値 = [" + staff.getPassword() + "] ==========");

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        if (staff.getRole() != null) {
            authorities.add(new SimpleGrantedAuthority(staff.getRole().getName()));
            System.out.println("========== [DEBUG] 4. ロール取得 = [" + staff.getRole().getName() + "] ==========");
        }

        return new User(
                staff.getStaffId(),
                staff.getPassword(),
                authorities
        );
    }
}