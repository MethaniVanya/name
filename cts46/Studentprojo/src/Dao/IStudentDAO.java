package Dao;

import java.util.List;

import javax.activation.DataSource;

import Data.Student;

public interface IStudentDAO {
	public void setdataSource(DataSource ds);
	public void create(Student Student);
	public Student getStudent(Integer id);
	public List<Student>listStudent();
	public void delete(Integer id);
	public void update (Student student);

}
