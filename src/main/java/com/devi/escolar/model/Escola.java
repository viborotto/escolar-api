package com.devi.escolar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String escola;

    @OneToMany(mappedBy = "escola")
    private List<Aluno> alunos;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tiaPerua_id")
    private TiaPerua tiaPerua;

    public Escola() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public TiaPerua getTiaPerua() {
        return tiaPerua;
    }

    public void setTiaPerua(TiaPerua tiaPerua) {
        this.tiaPerua = tiaPerua;
    }


}
