package com.example.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public Double calcularFrete(double valor) {
        double valorFrete = 0.0;

        if(valor < 100.00) {
            valorFrete = 20.00;
            return valorFrete;
        }
        else if(valor >= 100.00 && valor < 200.00) {
            valorFrete = 12.00;
            return valorFrete;
        }
        else {
            return valorFrete;
        }
    }
}
