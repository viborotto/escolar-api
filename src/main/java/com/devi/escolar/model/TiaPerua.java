package com.devi.escolar.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TiaPerua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tia_perua_id;

    private String ajudante;

    @OneToMany(mappedBy = "tiaPerua")
    private List<Aluno> alunos = new ArrayList<>();

    @OneToMany(mappedBy = "tiaPerua")
    private List<Escola> escolas = new ArrayList<>();

    public TiaPerua() {
    }

    public TiaPerua(Long tia_perua_id, String ajudante, List<Escola> escolas, List<Aluno> alunos) {
        this.tia_perua_id = tia_perua_id;
        this.ajudante = ajudante;
        this.alunos = alunos;
        this.escolas = escolas;
    }

    public Long getTia_perua_id() {
        return tia_perua_id;
    }

    public void setTia_perua_id(Long tia_perua_id) {
        this.tia_perua_id = tia_perua_id;
    }

    public String getAjudante() {
        return ajudante;
    }

    public void setAjudante(String ajudante) {
        this.ajudante = ajudante;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public void setEscolas(List<Escola> escolas) {
        this.escolas = escolas;
    }
}
