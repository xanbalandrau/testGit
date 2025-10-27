package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new PrintWelcome();

        System.out.println("Test");
        System.out.println("Commit avant checkout, puis branch dev");

        var chiffre = 1;
        if(chiffre ==(int)chiffre && chiffre %2 ==0){
            System.out.println("Pair");
        }else {
            System.out.println("Impair");
        }
        //SpringApplication.run(DemoApplication.class, args);
	}

}
