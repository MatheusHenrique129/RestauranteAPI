package com.src.restauranteapi.service;

import com.src.restauranteapi.entities.Caixa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaixaService {

    public double getValorCaixa(){
        return Caixa.getValorTotal();
    }
}
