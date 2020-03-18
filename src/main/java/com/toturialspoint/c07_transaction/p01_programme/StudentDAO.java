package com.toturialspoint.c07_transaction.p01_programme;
import java.util.List;
import javax.sql.DataSource;
/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 16:55
 * Desc:
 */
public interface StudentDAO {

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    public void create(String name, Integer age, Integer marks, Integer year);
    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    public List<StudentMarks> listStudents();

}
