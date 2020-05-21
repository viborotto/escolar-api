package com.devi.escolar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer idade;

    private String sala;

    private String periodo;

    private String professora;

    private String endereco;

    private String descricao;

    private String nomeEscola;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tiaPerua_id")
    private TiaPerua tiaPerua;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "escola_id")
    private Escola escola;


    public Aluno() {
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getProfessora() {
        return professora;
    }

    public void setProfessora(String professora) {
        this.professora = professora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TiaPerua getTiaPerua() {
        return tiaPerua;
    }

    public void setTiaPerua(TiaPerua tiaPerua) {
        this.tiaPerua = tiaPerua;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
}
