package com.devi.escolar.controller;

import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.service.TiaPeruaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/escolar")
public class TiaPeruaController {

    @Autowired
    public TiaPeruaService tiaPeruaService;

    @PostMapping("/createTia")
    public TiaPerua criar(@RequestBody TiaPerua tiaPerua){
        return tiaPeruaService.criarTiaPerua(tiaPerua);
    }

}
