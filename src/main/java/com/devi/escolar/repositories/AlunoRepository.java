package com.devi.escolar.repositories;

import com.devi.escolar.model.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
