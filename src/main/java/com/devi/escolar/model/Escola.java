package com.devi.escolar.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long escola_id;

    private String nome;

    @OneToMany(mappedBy = "escola")
    private List<Aluno> alunos;

    @ManyToOne
    @JoinColumn(name = "tia_perua_id",referencedColumnName="tia_perua_id",nullable=false)
    private TiaPerua tiaPerua;

    public Escola() {
    }

    public Long getEscola_id() {
        return escola_id;
    }

    public void setEscola_id(Long escola_id) {
        this.escola_id = escola_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
