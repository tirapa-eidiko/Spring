/**
 * 
 */
package com.tirapa.reddy;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author tirupa
 *
 */
@Aspect
public class Message {

	private String message;
	
	public Message() {
		System.out.println("this is default constructor");
		// TODO Auto-generated constructor stub
		message="This is default constructor message";
	}
	
	public Message(String msg) {
		System.out.println("this is one arg constructor");
		message=msg;
	}

	public String getMessage() {
		return message;
	}
	
	public void init()throws Exception{
		System.out.println("this is init method");
	}
	
	
	public void destroy()throws Exception{
		System.out.println("this is destroy method");
	}
	
	@Pointcut("execution(* transfer(..))")// the pointcut expression
	private void anyOldTransfer() {
		System.out.println("this is danyOldTransfer(");
	}// the pointcut signature

}
