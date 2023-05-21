package org.info.tienda.domain;

import java.time.LocalDateTime;

public class PrecioTachado extends Precio{
    private LocalDateTime fechaDeFinalizacion;

    public PrecioTachado() {}

    public PrecioTachado(double valor, LocalDateTime fechaDeCarga, LocalDateTime fechaDeFinalizacion) {
        this.valor = valor;
        this.fechaDeCarga = fechaDeCarga;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    @Override
    public String toString() {
        return "PrecioTachado{" +
                "valor=" + valor +
                ", fechaDeCarga=" + fechaDeCarga +
                ", fechaDeFinalizacion=" + fechaDeFinalizacion +
                '}';
    }

    @Override
    public void hacerAlgoConPrecio(Precio precio) {
        System.out.println("Soy Precio tachado, mi valor es : " + precio.getValor());
    }

    public void setFechaDeFinalizacion(LocalDateTime of) {
        this.fechaDeFinalizacion = of;
    }
}
