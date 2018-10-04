package com.example.demo;

public class Lance {
    private Usuario usuario;
    private Double valor;

    public Lance(Usuario usuario, Double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Double getValor() {
        return valor;
    }
}