package jdbcprograms;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
this.jdbcTemplate=jdbcTemplate;
}
public int saveEmployee(Employee e)
{
String query="insert into employeee values('"+e.getEmpid()+"','"+e.getEname()+"','"+e.getDept()+"','"+e.getDesg()+"','"+e.getEmail()+"')"; 
return jdbcTemplate.update(query);
}
/*public int updateEmployee(Employee e)
{
String query="update employee set name='"+e.getEname()+"',salary='"+e.getDept()+"'where id='"+e.getEmpid()+"'";
return jdbcTemplate.update(query);
}*/
public int deleteEmployee(Employee e)
{
String query="delete from employee where id='"+e.getEmpid()+"' ";
return jdbcTemplate.update(query);
}
}