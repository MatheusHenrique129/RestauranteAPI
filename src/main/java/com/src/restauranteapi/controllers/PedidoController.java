package com.src.restauranteapi.controllers;

import com.src.restauranteapi.DTO.FechaPedidoDTO;
import com.src.restauranteapi.entities.Caixa;
import com.src.restauranteapi.entities.Mesa;
import com.src.restauranteapi.repository.MesaRepo;
import com.src.restauranteapi.service.CaixaService;
import com.src.restauranteapi.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {
    @Autowired
    private MesaRepo mesaRepo;
    @Autowired
    private PedidoService pedidosService;
    @Autowired
    private CaixaService caixaService;

    @PostMapping("/salvamesa")
    public Mesa salvaMesa(@RequestBody Mesa mesa) {
        mesaRepo.salvar(mesa);
        return mesaRepo.getMesa(mesa.getId());
    }

    @PutMapping("/fecharpedido")
    public ResponseEntity<Mesa> fechaMesa(@RequestBody FechaPedidoDTO fechaPedido) {

        Mesa mesa = mesaRepo.getMesa(fechaPedido.getId());
        if (mesa != null) {
            pedidosService.fechamentoPedidos(fechaPedido.getId());
            return ResponseEntity.ok(mesa);
        }

        return ResponseEntity.status(404).build();
    }

    @GetMapping("/consultapedido/{id}")
    public ResponseEntity<Mesa> consultaPedido(@PathVariable Long id) {

        Mesa mesa = mesaRepo.getMesa(id);
        if (mesa != null) {
            return ResponseEntity.ok(mesa);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("consultacaixa/{id}")
    public double consultaCaixa() {
        return caixaService.getValorCaixa();
    }
}
