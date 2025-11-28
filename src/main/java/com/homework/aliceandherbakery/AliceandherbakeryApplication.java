package com.homework.aliceandherbakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceandherbakeryApplication implements CommandLineRunner {




	public static void main(String[] args) {
		SpringApplication.run(AliceandherbakeryApplication.class, args);
	}

    @Autowired
    CakeBaker cakeBaker;

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}
