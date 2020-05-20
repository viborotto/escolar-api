package com.devi.escolar.service;

import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.TiaPeruaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TiaPeruaService {

    @Autowired
    private TiaPeruaRepository tiaPeruaRepository;

    //post
    public TiaPerua criarTiaPerua(TiaPerua tiaPerua){
        return tiaPeruaRepository.save(tiaPerua);
    }
    //getById
    public TiaPerua tiaById(Long id){
        Optional<TiaPerua> tiaPeruaOptional = tiaPeruaRepository.findById(id);
        return tiaPeruaOptional.get();
    }

    //getAll
    public Iterable<TiaPerua> listaTia(){
        return tiaPeruaRepository.findAll();
    }
    //update

    //delete
}
