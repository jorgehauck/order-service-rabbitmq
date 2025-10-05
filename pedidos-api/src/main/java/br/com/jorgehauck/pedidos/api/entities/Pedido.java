package br.com.jorgehauck.pedidos.api.entities;

import br.com.jorgehauck.pedidos.api.entities.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private UUID id = UUID.randomUUID();
    private String cliente;
    private List<ItemPedido> itensPedido = new ArrayList<>();
    private BigDecimal valorTotal;
    private String emailNotificacao;
    private Status status = Status.EM_PROCESSAMENTO;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora = LocalDateTime.now();
    public Pedido() {}
    public Pedido(UUID id, String cliente, BigDecimal valorTotal, String emailNotificacao) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.emailNotificacao = emailNotificacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getEmailNotificacao() {
        return emailNotificacao;
    }
    public void setEmailNotificacao(String emailNotificacao) {
        this.emailNotificacao = emailNotificacao;
    }
    public Status getStatus() {
        return status;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", itensPedido=" + itensPedido +
                ", valorTotal=" + valorTotal +
                ", emailNotificacao='" + emailNotificacao + '\'' +
                ", status=" + status +
                ", dataHora=" + dataHora +
                '}';
    }
}
