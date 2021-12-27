package com.src.restauranteapi.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pratos {
    private Long id;
    private double preco;
    private String descricao;
    private int quantidade;


}
