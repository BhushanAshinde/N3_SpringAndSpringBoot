package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class,args );
		Scanner s=new Scanner(System.in);
		/*int x=s.nextInt();
		System.out.println(x);
		Employee e=contex.getBean(Employee.class);
		e.setEmpid(1020);
		e.setEmpname("Bhushan Shinde");
		e.print();*/
		
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
	}

}
