
package Springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QBmaptest {

public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("QBMap.xml");
Example q1=(Example)context.getBean("qb");
q1.showAnswers();
}

}