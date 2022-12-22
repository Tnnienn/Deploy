package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    //ESERCIZIO DEPLOY 01
    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getName(){
        String name = environment.getProperty("devName");
        return name;
    }

    //ESERCIZIO DEPLOY 02

    @GetMapping("/number")
    public double getNumber(){
        double value = Math.random()*100;
        double valueTwo = Math.random()*100;
        double somma =  value + valueTwo;
        return somma;
    }
}