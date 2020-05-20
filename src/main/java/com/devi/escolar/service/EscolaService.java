package com.devi.escolar.service;

import com.devi.escolar.model.Escola;
import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscolaService {

    @Autowired
    public EscolaRepository escolaRepository;

    public Escola criarEscola(TiaPerua tiaPerua, Escola escola){
        escola.setTiaPerua(tiaPerua);
        return escolaRepository.save(escola);
    }
}
