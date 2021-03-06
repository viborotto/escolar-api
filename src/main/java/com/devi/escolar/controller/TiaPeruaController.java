package com.devi.escolar.controller;

import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.service.TiaPeruaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/escolar")
public class TiaPeruaController {

    @Autowired
    public TiaPeruaService tiaPeruaService;

    @PostMapping("/createTia")
    public TiaPerua criar(@RequestBody TiaPerua tiaPerua){
        return tiaPeruaService.criarTiaPerua(tiaPerua);
    }

    @GetMapping("/tias")
    public Iterable<TiaPerua> listaTias(){
        return tiaPeruaService.listaTia();
    }

}
