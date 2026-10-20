package com.example.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class DescontoService {

    public Double calcularValorDeDesconto(double valor, double porcentagem) {
        return (valor * porcentagem) / 100;
    }
}
