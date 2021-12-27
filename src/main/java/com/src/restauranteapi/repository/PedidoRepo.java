package com.src.restauranteapi.repository;

import com.src.restauranteapi.entities.Mesa;
import com.src.restauranteapi.entities.Pedidos;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepo {
    List<Pedidos> pedidos = new ArrayList<>();

    public void salvar(Pedidos pedidos){
        this.pedidos.add(pedidos);
    }

    public Pedidos getPedidos(Long id){
        return pedidos.stream().filter(pedidos1 -> pedidos1.getId() == id).findFirst().orElse(new Pedidos());
    }
}
