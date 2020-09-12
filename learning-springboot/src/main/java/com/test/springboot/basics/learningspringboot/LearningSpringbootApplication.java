package com.test.springboot.basics.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/* This annotation does 3 things:
	 1- indicated its spring appication context
	 2- Enables auto configuration
	 3- Enables comonent scaning in this package*/

@SpringBootApplication
public class LearningSpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearningSpringbootApplication.class, args);
		
		ApplicationContext appicationContext = SpringApplication.run(LearningSpringbootApplication.class, args);
		
		for (String beanName : appicationContext.getBeanDefinitionNames())
		{
			System.out.println("Autoconfigured Beans name: "+ beanName);
		}
		
	}

}
