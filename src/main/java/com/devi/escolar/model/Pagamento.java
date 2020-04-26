package com.devi.escolar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagamento_id;

    private Double valor;

    private String tipoPagamento;

    public Pagamento() {
    }

    public Long getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(Long pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
