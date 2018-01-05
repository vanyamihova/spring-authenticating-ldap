package main.java.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vanyamihova on 28/12/2017.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

}
