package com.example.desafio.entities;

public class Pedido {

    private String codigo;
    private Double valorBasico;
    private Double porcetagemDesconto;

    public Pedido() {
    }

    public Pedido(String codigo, Double valorBasico, Double porcetagemDesconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.porcetagemDesconto = porcetagemDesconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(Double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public Double getPorcetagemDesconto() {
        return porcetagemDesconto;
    }

    public void setPorcetagemDesconto(Double porcetagemDesconto) {
        this.porcetagemDesconto = porcetagemDesconto;
    }
}
