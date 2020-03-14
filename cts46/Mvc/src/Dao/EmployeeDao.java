package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import data.Employee;
public class EmployeeDao
{
public static Connection getConnection()throws ClassNotFoundException,ServletException,IOException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	 java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	 Statement st=con.createStatement();
	 return con;
}

public void insertEmployee(Employee emp)
{

}
public List<Employee>showEmployee()
{
List<Employee> list=new ArrayList<Employee>();
try
{
Connection con=getConnection();
Statement ps=con.createStatement();
ResultSet rs=ps.executeQuery("select *from employeee");
while(rs.next())
{
Employee u=new Employee();
u.setEname(rs.getString(1));
u.setEmpid(rs.getString(2));
u.setDept(rs.getString(3));
u.setDesg(rs.getString(4));
u.setEmail(rs.getString(5));


list.add(u);
}

}
catch(Exception e)
{
System.out.println(e);

}
return list;

}

}

