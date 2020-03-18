package com.toturialspoint.c06_JDBC.p01_JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 14:53
 * Desc:
 */
public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }

}
