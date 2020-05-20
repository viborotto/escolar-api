package com.devi.escolar.service;

import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.TiaPeruaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiaPeruaService {

    @Autowired
    private TiaPeruaRepository tiaPeruaRepository;

    //post
    public TiaPerua criarTiaPerua(TiaPerua tiaPerua){
        return tiaPeruaRepository.save(tiaPerua);
    }
    //get

    //getAll

    //update

    //delete
}
