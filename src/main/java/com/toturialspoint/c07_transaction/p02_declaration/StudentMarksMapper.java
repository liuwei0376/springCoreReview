package com.toturialspoint.c07_transaction.p02_declaration;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 16:56
 * Desc:
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {

    public StudentMarks mapRow(ResultSet rs, int i) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(rs.getInt("id"));
        studentMarks.setName(rs.getString("name"));
        studentMarks.setAge(rs.getInt("age"));
        studentMarks.setSid(rs.getInt("sid"));
        studentMarks.setMarks(rs.getInt("marks"));
        studentMarks.setYear(rs.getInt("year"));
        return studentMarks;
    }
}
