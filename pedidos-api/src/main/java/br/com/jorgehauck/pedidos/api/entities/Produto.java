package br.com.jorgehauck.pedidos.api.entities;

import java.math.BigDecimal;
import java.util.UUID;
public class Produto {
    private UUID id = UUID.randomUUID();
    private String nome;
    private BigDecimal valor;
    public Produto() {}
    public Produto(UUID id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
