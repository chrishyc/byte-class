package spring.springboot;

import chris.mystarter.TestBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.springboot.controller.DemoController;
import spring.springboot.pojo.Custom;
import spring.springboot.pojo.Dog;
import spring.springboot.pojo.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {
	
	@Autowired
	private DemoController demoController;
	
	@Autowired
	private Person person;
	
	@Autowired
	private Dog dog;
	
	@Autowired
	private Custom custom;
	
	@Value("${custom.number.inrange}")
	private int range;
	
	@Autowired
	private TestBean testBean;

	@Test
	void contextLoads() {
		demoController.sayHello();
	}
	
	@Test
	public void testConfigurationProperties(){
		System.out.println(person);
		System.out.println(person);
	}
	
	@Test
	public void testValue(){
		System.out.println(dog);
		System.out.println(dog);
	}
	
	@Test
	public void testCustom(){
		System.out.println(custom);
		System.out.println(custom);
	}
	
	@Test
	public void testRef(){
		System.out.println(range);
		System.out.println(custom);
	}
	
	@Test
	public void testMyStarter(){
		System.out.println(testBean);
		System.out.println(testBean);
	}
}
