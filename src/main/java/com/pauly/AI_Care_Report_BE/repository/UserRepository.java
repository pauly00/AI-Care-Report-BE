package com.pauly.AI_Care_Report_BE.repository;


import com.pauly.AI_Care_Report_BE.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 사용자 저장(INSERT)
    public void save(User user) {
        String sql = "Insert INTO users (email, password, name, role) VALUES(?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getEmail(), user.getPassword(), user.getName(), user.getRole());
    }

    // 사용자 조회(SELECT)
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", userRowMapper());
    }

    private RowMapper<User> userRowMapper() {
        return (rs, rowNum) -> new User(
                rs.getLong("id"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("role")
        );
    }
}
