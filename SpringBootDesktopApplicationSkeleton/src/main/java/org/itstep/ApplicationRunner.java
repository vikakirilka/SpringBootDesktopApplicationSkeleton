package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class ApplicationRunner implements CommandLineRunner
{
	
	@Autowired
	SpringTest sTest;
	
    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(ApplicationRunner.class);
        app.run(args);
    }

	public void run(String... arg0) throws Exception {
		sTest.testMethodRun();
	}
}
