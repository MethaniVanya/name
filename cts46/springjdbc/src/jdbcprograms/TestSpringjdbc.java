package jdbcprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringjdbc {

public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationframewrok.xml");
EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
Employee emp=new Employee();
emp.setEmpid("1010");
emp.setEname("vanya");
emp.setDept("testing");
emp.setDesg("tester");
emp.setEmail("vanya14@gamilcom");
int status=dao.saveEmployee(emp);
System.out.println(status);
System.out.println("records inserted");
}

}