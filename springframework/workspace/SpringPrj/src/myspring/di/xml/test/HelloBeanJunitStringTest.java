package myspring.di.xml.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")

public class HelloBeanJunitStringTest {
	@Autowired
	ApplicationContext context;
	
	
	@Test
	public void test2() {
		Hello hello = (Hello)context.getBean("hello");
		
		Hello hello2 = (Hello)context.getBean("hello");
		
		assertSame(hello, hello2);
	}
	
	@Test @Ignore
	public void test1() {
		//2. getBean() 가져오기
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello의 sayHello() 호출
		assertEquals("Hello Spring", hello.sayHello());
		//3. Hello의 printer() 호출
		hello.print();
		
		
		//StringPrinter getBean()
		Printer printer = context.getBean("printer",Printer.class);
		assertEquals("Hello Spring",printer.toString());
	}

}
