package br.com.fiap.ms.pedidos.repositories;

import br.com.fiap.ms.pedidos.entities.ItemDoPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, Long> {
}
