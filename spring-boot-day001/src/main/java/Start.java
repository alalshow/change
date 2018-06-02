

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Start {
	 
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	String test() {
		return "test!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Start.class, args);
	}

}
