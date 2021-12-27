package com.src.restauranteapi.repository;

import com.src.restauranteapi.entities.Mesa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MesaRepo {
    List<Mesa> mesa = new ArrayList<>();

    public void salvar(Mesa mesa) {
        this.mesa.add(mesa);
    }

    public Mesa getMesa(Long id) {
        int test = mesa.size();

        if (test > 0) {
            return mesa.stream().filter(mesa1 -> mesa1.getId() == id).findFirst().orElse(new Mesa());
        }

        return null;
    }
}
