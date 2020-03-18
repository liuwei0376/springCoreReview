package com.toturialspoint.c06_JDBC.p01_JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 14:55
 * Desc:
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String sql = "insert into Student(name, age) values(?,?)";
        jdbcTemplateObject.update(sql, name, age);
    }

    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(
                sql,
                new Object[]{id},
                new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String sql = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    public void delete(Integer id) {
        String sql = "delete from Student where id = ?";
        jdbcTemplateObject.update(sql, id);
        System.out.println("Delete Recod with ID = " + id);
    }

    public void update(Integer id, Integer age) {
        String sql = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(sql, new Object[]{age, id});
        System.out.println("Updated Record with ID = " + id);
        return;
    }
}
