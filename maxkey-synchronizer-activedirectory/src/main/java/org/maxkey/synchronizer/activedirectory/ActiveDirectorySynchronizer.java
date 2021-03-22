package org.maxkey.synchronizer.activedirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ActiveDirectorySynchronizer {
	
	public static void main(String[] args) {
	    ConfigurableApplicationContext context = SpringApplication.run(ActiveDirectorySynchronizer.class, args);
		  
	}
	
}
