package demo.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(String name) {
        return "Hello "+ name+ ". This is Spring Boot Application";
    }

}
