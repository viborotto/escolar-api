package com.devi.escolar.service;

import com.devi.escolar.model.Aluno;
import com.devi.escolar.model.Escola;
import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    public AlunoRepository alunoRepository;

    //criar Aluno na lista da tia da perua
    public Aluno criarAluno(TiaPerua tiaPerua, Aluno aluno){
        aluno.setTiaPerua(tiaPerua);
        return alunoRepository.save(aluno);
    }

    //nomeEscola do aluno corresponde a um ID da Escola dot DB
    public void regra(Aluno aluno, Escola escola){
        if(aluno.getNomeEscola()=="Eufly" && escola.getEscola().equals("Eufly")){
            aluno.setEscola(escola);
        }
    }
}
