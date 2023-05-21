package org.info.tienda.servicio.precio.impl;


import org.info.tienda.domain.PrecioActual;
import org.info.tienda.domain.PrecioTachado;
import org.info.tienda.servicio.entrada.impl.InputService;
import org.info.tienda.servicio.precio.PrecioService;

import java.time.LocalDateTime;

public class PrecioServiceImpl implements PrecioService{


    @Override
    public PrecioActual crearPrecioActual(double precioNuevo) {
        PrecioActual precioActual = new PrecioActual();

        precioActual.setValor(precioNuevo);
        precioActual.setFechaDeCarga(LocalDateTime.now());
        return precioActual;
    }

    @Override
    public PrecioActual crearPrecioActual() {

        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        //precioActual.setValor(InputService.getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());


        return precioActual;
    }

    @Override
    public PrecioTachado crearPrecioTachado(PrecioActual precioActual) {

        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        //precioTachado.setValor(InputService.getScanner().nextDouble());
        //precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0,0));

        return precioTachado;
    }
}
