package Dao;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import Data.Student;

public class StudentDaoImpl implements IStudentDAO {
     JdbcTemplate jdbcTemplate;
	@Override
	public void setdataSource(DataSource ds) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
		int result=jdbcTemplate.update(query);
		System.out.println(result+ "records inserted sucessfully.........");
		}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

}
