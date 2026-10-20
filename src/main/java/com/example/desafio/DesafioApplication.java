package com.example.desafio;

import com.example.desafio.entities.Pedido;
import com.example.desafio.services.PedidoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private final PedidoService pedidoService;

	public DesafioApplication(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido pedido = new Pedido("1034", 150.00, 20.0);
		System.out.println("Pedido código " + pedido.getCodigo());
		System.out.println("Valor total: R$ " + pedidoService.calcularValorTotalDoPedido(pedido));

		System.out.println();

		Pedido pedido1 = new Pedido("2282", 800.00, 10.0);
		System.out.println("Pedido código " + pedido1.getCodigo());
		System.out.println("Valor total: R$ " + pedidoService.calcularValorTotalDoPedido(pedido1));

		System.out.println();

		Pedido pedido2 = new Pedido("1309", 95.90, 0.0);
		System.out.println("Pedido código " + pedido2.getCodigo());
		System.out.println("Valor total: R$ " + pedidoService.calcularValorTotalDoPedido(pedido2));
	}
}
