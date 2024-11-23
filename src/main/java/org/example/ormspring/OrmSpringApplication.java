package org.example.ormspring;

import org.example.ormspring.entidades.Departamento;
import org.example.ormspring.entidades.Funcionario;
import org.example.ormspring.repositorios.DepartamentoRepo;
import org.example.ormspring.repositorios.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmSpringApplication implements CommandLineRunner {

    @Autowired
    private FuncionarioRepo funcionarioRepo;

    @Autowired
    private DepartamentoRepo departamentoRepo;

    public static void main(String[] args) {
        SpringApplication.run(OrmSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Alceu Dispor");
//        funcionarioRepo.save(funcionario);

//        funcionarioRepo.findById(2).ifPresentOrElse(funcionario -> {
//            System.out.println(funcionario.getNome());
//        }, () -> {
//            System.out.println("Funcionário não encontrado.");
//        });

        Departamento departamento = new Departamento();
        departamento.setNome("Almoxarifado");
        departamento.getFuncionarios().add(funcionarioRepo.findById(1).get());
        departamento.getFuncionarios().add(funcionarioRepo.findById(2).get());
    }
}
