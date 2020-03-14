package configs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestMain {
public static void main(String[] args ) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	HelloWorld helloword=ctx.getBean(HelloWorld.class);
	helloWorld .setMessage("Hello World");
	helloWorld .setMessage();
	helloworld.showData();
	Employee emp=ctx.getBean(Employee.class);
	emp.showEmp();
	
	
}
}
