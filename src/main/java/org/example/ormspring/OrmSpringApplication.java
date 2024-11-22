package org.example.ormspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrmSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
