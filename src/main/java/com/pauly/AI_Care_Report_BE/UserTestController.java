package com.pauly.AI_Care_Report_BE;

import com.pauly.AI_Care_Report_BE.entity.User;
import com.pauly.AI_Care_Report_BE.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;

// 유저 입력 테스트
public class UserTestController implements CommandLineRunner {
    private final UserRepository userRepository;

    public UserTestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        // 테스트 데이터 저장
        User newUser = new User(null, "test@test.com", "1234", "홍길동", "USER");
        userRepository.save(newUser);
        System.out.println("저장 완료");

        // 조회
        userRepository.findAll().forEach(user -> System.out.println("조회된 유저: " + user.getName()));
    }
}
