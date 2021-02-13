package WebApp;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {


    public String helloWorld(){
        return "Hello World!";

    }
}
