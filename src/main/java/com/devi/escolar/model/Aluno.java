package com.devi.escolar.model;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aluno_id;

    private String nome;

    private Integer idade;

    private String sala;

    @ManyToOne
    @JoinColumn(name = "escola_id",referencedColumnName="escola_id",nullable=false)
    private Escola escola;

//    private Pagamento pagamento; tem que ser um ENUM??

    private String periodo;

    private String professora;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tia_perua_id",referencedColumnName="tia_perua_id",nullable=false)
    private TiaPerua tiaPerua;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="endereco_id", referencedColumnName="endereco_id",nullable=false)
    private Endereco endereco;

    public Aluno() {
    }

    public Long getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(Long aluno_id) {
        this.aluno_id = aluno_id;
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

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
