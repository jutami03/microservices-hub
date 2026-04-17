package br.com.fiap.ms.pedidos.dto;

import br.com.fiap.ms.pedidos.entities.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StatusDTO {
    private Status status;
}
