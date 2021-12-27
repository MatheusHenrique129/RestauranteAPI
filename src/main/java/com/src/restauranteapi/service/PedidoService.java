package com.src.restauranteapi.service;

import com.src.restauranteapi.entities.Mesa;
import com.src.restauranteapi.repository.MesaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.src.restauranteapi.entities.Caixa.somarValor;

@Service
public class PedidoService {
    @Autowired
    private MesaRepo mesaRepo;

    public void fechamentoPedidos (Long id){
        Mesa mesa = mesaRepo.getMesa(id);
        somarValor(mesa.getValorTotal());
        mesa.limpaPedidos(mesa);

    }
}
