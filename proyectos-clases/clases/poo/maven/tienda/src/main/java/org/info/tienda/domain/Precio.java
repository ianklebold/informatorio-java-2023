package org.info.tienda.domain;

import java.time.LocalDateTime;

public abstract class Precio{

    protected double valor;

    protected LocalDateTime fechaDeCarga;

    public abstract void hacerAlgoConPrecio(Precio precio);

    public void mostrarInfo(){
        System.out.println("Metodo por default");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDateTime fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }
}
