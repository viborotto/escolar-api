package com.devi.escolar.controller;

import com.devi.escolar.model.Aluno;
import com.devi.escolar.model.TiaPerua;
import com.devi.escolar.service.AlunoService;
import com.devi.escolar.service.EscolaService;
import com.devi.escolar.service.TiaPeruaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/escolar")
public class AlunoController {

    @Autowired
    public AlunoService alunoService;

    @Autowired
    public TiaPeruaService tiaPeruaService;

    @Autowired
    public EscolaService escolaService;

    @PostMapping("/tia/{id}/novoAluno")
    public Aluno criarAluno(@PathVariable Long id, @RequestBody Aluno aluno){
        TiaPerua tiaPerua = tiaPeruaService.tiaById(id);

        return alunoService.criarAluno(tiaPerua, aluno);
    }
}
