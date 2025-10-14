package br.com.jorgehauck.pedidos.processador.repositories;

import br.com.jorgehauck.pedidos.processador.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID> {
}
