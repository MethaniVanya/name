package EventListeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRereshEventHandler implements ApplicationListener<ContextRefreshedEvent>
{
public void  onApplicationEvent(ContextRefreshedEvent event)
{
System.out.println("context is refreshed");
}

}