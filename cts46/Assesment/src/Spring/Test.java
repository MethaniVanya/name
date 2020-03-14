package Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
 
    public static void main(String[] args) {
        ApplicationContext cont=new ClassPathXmlApplicationContext("Application.xml");
        Mapping qump=(Mapping)cont.getBean("qump");
        qump.showAnswers();
       
  }}