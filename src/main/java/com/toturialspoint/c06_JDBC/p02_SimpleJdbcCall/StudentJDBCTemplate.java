package com.toturialspoint.c06_JDBC.p02_SimpleJdbcCall;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 14:55
 * Desc:
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    public void create(String name, Integer age) {
        String sql = "insert into Student(name, age) values(?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";

        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));

        return student;
    }

    public List<Student> listStudents() {
        String sql = "select * from Student";
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

}
