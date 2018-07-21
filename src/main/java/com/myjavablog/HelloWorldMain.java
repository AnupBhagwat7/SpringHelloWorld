/**
 * 
 */
package com.myjavablog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.beans.HelloWorldBean;

/**
 * @author anupb
 *
 */
public class HelloWorldMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("HelloWorld.xml");

		HelloWorldBean beanInstance = (HelloWorldBean) beanFactory.getBean("HelloWorldBean");
		beanInstance.printHello();
	}

}
