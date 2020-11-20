package sea1.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping
    public String hello(){
        return"<h1>Hello World</h1>";
    }
}
