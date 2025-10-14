package br.com.jorgehauck.pedidos.processador.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;
@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
    @Id
    private UUID id = UUID.randomUUID();
    @ManyToOne
    private Produto produto;
    private Integer quantidade;
    @ManyToOne
    private Pedido pedido;
    public ItemPedido() {}
    public ItemPedido(UUID id, Produto produto, Integer quantidade, Pedido pedido) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
