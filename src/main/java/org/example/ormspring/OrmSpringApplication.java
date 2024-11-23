package org.example.ormspring;

import org.example.ormspring.entidades.Funcionario;
import org.example.ormspring.repositorios.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmSpringApplication implements CommandLineRunner {

    @Autowired
    private FuncionarioRepo funcionarioRepo;

    public static void main(String[] args) {
        SpringApplication.run(OrmSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rolando Caio da Rocha");
        funcionarioRepo.save(funcionario);
    }
}
