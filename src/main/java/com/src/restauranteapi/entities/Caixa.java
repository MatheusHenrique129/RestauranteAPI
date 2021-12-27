package com.src.restauranteapi.entities;

import lombok.Getter;

public class Caixa {
    private static double valorTotal;

    public static void somarValor(double valor){
        valorTotal += valor;
    }

    public static double getValorTotal() {
        return valorTotal;
    }
}


