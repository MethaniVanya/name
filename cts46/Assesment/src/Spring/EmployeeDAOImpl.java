package Spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDAOImpl implements EmployeeDAO
{
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	

	@Override
	public List<Employee> getEmployee() {
		String sql="select * from employes";
		List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>(){

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
		
				Employee e=new Employee();
				e.setName(rs.getString("name"));
				e.setId(rs.getString("id"));
				e.setDept(rs.getString("dept"));
				e.setDesg(rs.getString("desg"));
				e.setComp(rs.getString("comp"));
				e.setEmail(rs.getString("email"));
				return e;
				
			}
		});
		return list;
	}
	}


