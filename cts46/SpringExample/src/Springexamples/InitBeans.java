package Springexamples;
import org.Springframework.bean.BeanException;
public class initBeans implements BeanPostProcessor
{
  public Object postProcessBeforeInitialization(Object bean,String beanName)
   throws BeanException
   {
  System.out.println("before initialization");
  return bean;
   }
  public Object postProcessAfterInitialization(Object bean,String beanName)
  throws BeansException
  {
  System.out.println("after intialization");

  return bean;
  }
}