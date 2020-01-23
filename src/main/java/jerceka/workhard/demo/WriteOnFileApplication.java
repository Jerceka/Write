package jerceka.workhard.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WriteOnFileApplication {

	public static void main(String[] args) throws IOException{
		SpringApplication.run(WriteOnFileApplication.class, args);
		Main m = new Main();
		m.here();
	}

}
