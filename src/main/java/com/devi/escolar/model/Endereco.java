package com.devi.escolar.model;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long endereco_id;

    private String rua;

    private Integer numero;

    private String bairro;

    @OneToOne
    @JoinColumn(name="aluno_id", referencedColumnName="aluno_id",nullable=false)
    private Aluno aluno;

    public Endereco() {
    }

    public Long getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Long endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
