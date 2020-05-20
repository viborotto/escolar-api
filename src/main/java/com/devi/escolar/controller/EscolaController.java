package com.devi.escolar.controller;

import com.devi.escolar.model.Escola;
import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.service.EscolaService;
import com.devi.escolar.service.TiaPeruaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/escolar")
public class EscolaController {

    @Autowired
    public EscolaService escolaService;

    @Autowired
    public TiaPeruaService tiaPeruaService;

    //certo:  a lista de escolas da tia da perua ser preenchida conforme a instituicao do aluno
    @PostMapping("tia/{id}/novaEscola")
    public Escola criaEscola(@PathVariable Long id, @RequestBody Escola escola){
        TiaPerua tiaPerua = tiaPeruaService.tiaById(id);
        return escolaService.criarEscola(tiaPerua,escola);
    }
}
