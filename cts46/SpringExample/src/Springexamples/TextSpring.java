package Springexamples;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class TextSpring {
public static void main(String[] args) {
// TODO Auto-generated method stub
ClassPathResource cps=new ClassPathResource("bean.xml");
XmlBeanFactory factor=new XmlBeanFactory(cps);
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
//obj.getMessage();
//obj.display();
Employee e=(Employee) context.getBean("emp");
e.displayemp();
}
}