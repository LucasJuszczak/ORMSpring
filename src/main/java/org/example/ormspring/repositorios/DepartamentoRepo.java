package org.example.ormspring.repositorios;

import org.example.ormspring.entidades.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepo extends CrudRepository<Departamento, Integer> { }
