package com.src.restauranteapi.entities;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
public class Pedidos {
    private Long id;
    private Long idMesa;
    private List<Pratos> pratos;
    @Setter(AccessLevel.NONE)
    private double valorTotal;

    public Pedidos(Long id, Long mesa, List<Pratos> pratos) {
        this.id = id;
        this.idMesa = mesa;
        this.pratos = pratos;
    }

    public double getValorTotal() {
        return pratos.stream().map(prato -> prato.getPreco() * prato.getQuantidade()).reduce(0.0,Double::sum);
    }

}
