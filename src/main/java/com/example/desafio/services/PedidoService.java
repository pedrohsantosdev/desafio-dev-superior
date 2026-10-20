package com.example.desafio.services;

import com.example.desafio.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final DescontoService descontoService;
    private final FreteService freteService;

    public PedidoService(DescontoService descontoService, FreteService freteService) {
        this.descontoService = descontoService;
        this.freteService = freteService;
    }

    public Double calcularValorTotalDoPedido(Pedido pedido) {
        return pedido.getValorBasico() - descontoService.calcularValorDeDesconto(pedido.getValorBasico(), pedido.getPorcetagemDesconto()) +
                freteService.calcularFrete(pedido.getValorBasico());
    }
}
