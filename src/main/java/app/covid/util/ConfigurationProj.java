package app.covid.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationProj {

	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
}
