package com.jsnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppController {
    public static void main(String[] args) {
        SpringApplication.run(MyAppController.class,args);
    }

    @GetMapping("/geta")
    public String getA(){
        return "5555555";
    }

}
