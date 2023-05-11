package clases.poo.escenario2v2.dominio;

import java.time.LocalDateTime;

public class PrecioActual {
    //su valor, la fecha y hora en la que fue cargado

    private double valor;
    private LocalDateTime fechaDeCarga;

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

    @Override
    public String toString() {
        return "PrecioActual{" +
                "valor=" + valor +
                ", fechaDeCarga=" + fechaDeCarga +
                '}';
    }
}
