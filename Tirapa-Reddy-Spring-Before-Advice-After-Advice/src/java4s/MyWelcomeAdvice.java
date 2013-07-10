package java4s;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdvice implements MethodBeforeAdvice 
{

	public void before(Method m, Object args[], Object target)throws Exception
	{
		System.out.println("Am from BeforeAdvice to "+m.getName());
	}
   
}
