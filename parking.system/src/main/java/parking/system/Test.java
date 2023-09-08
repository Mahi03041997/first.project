package parking.system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("parking/system/config.xml");
		UserEntity user = (UserEntity)context.getBean("user");
		System.out.println(user);
		// regitering shutdown hook
		context.registerShutdownHook();

	}

}
