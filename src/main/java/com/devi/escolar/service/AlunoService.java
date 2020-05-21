package com.devi.escolar.service;

import com.devi.escolar.model.Aluno;
import com.devi.escolar.model.Escola;
import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.AlunoRepository;
import com.devi.escolar.repositories.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    public AlunoRepository alunoRepository;

    @Autowired
    public EscolaRepository escolaRepository;

    //criar Aluno na lista da tia da perua
    public Aluno criarAluno(TiaPerua tiaPerua, Aluno aluno){
        //cria escola
        Escola escola = new Escola();
        escola.setTiaPerua(tiaPerua);
        aluno.setEscola(escola);
        escolaRepository.save(escola);
        //cria ALuno
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
