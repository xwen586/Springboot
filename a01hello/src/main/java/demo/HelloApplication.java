package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	@RequestMapping("/")
	public String home() {
        return "Hello spring boot...!  (https://github.com/xwen586/Springboot.git)";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
