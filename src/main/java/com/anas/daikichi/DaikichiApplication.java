package com.anas.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class DaikichiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiApplication.class, args);
    }
    @RestController
    public class Daikichi {

        @RequestMapping ("/")
        public String first(){
            return "Did you mean localhost:8080/daikichi ?";
        }


    }

}

