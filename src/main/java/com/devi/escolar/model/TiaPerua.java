package com.devi.escolar.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TiaPerua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String ajudante;

    @OneToMany(mappedBy = "tiaPerua")
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "tiaPerua")
    private List<Escola> escolas;


    public TiaPerua() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
