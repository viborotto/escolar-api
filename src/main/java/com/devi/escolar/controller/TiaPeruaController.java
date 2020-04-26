package com.devi.escolar.controller;

import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.repositories.TiaPeruaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/escolar")
public class TiaPeruaController {

    @Autowired
    private TiaPeruaRepository tiaPeruaRepository;

    @GetMapping("/tia")
    public List<TiaPerua> getTiaPerua(){
        return tiaPeruaRepository.findAll();
    }
}
