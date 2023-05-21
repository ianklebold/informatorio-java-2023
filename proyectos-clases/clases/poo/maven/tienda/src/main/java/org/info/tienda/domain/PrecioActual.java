package org.info.tienda.domain;

import java.time.LocalDateTime;

public class PrecioActual extends Precio{
    //su valor, la fecha y hora en la que fue cargado

    public PrecioActual(double valor, LocalDateTime fechaDeCarga) {
        this.valor = valor;
        this.fechaDeCarga = fechaDeCarga;
    }

    public PrecioActual() {
    }

    @Override
    public String toString() {
        return "PrecioActual{" +
                "valor=" + valor +
                ", fechaDeCarga=" + fechaDeCarga +
                '}';
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Hola este metodo es overrideado");
    }

    @Override
    public void hacerAlgoConPrecio(Precio precio) {
        System.out.println("Soy Precio actual, mi valor es : " + precio.getValor());
    }
}
