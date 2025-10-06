package br.com.jorgehauck.pedidos.notificacao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private UUID id = UUID.randomUUID();
    private String nome;
    private BigDecimal valor;
}