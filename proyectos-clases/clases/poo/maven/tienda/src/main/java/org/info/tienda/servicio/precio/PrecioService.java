package org.info.tienda.servicio.precio;

import org.info.tienda.domain.PrecioActual;
import org.info.tienda.domain.PrecioTachado;

public interface PrecioService {


    //Polimorfismo
    PrecioActual crearPrecioActual(double precioNuevo);
    PrecioActual crearPrecioActual();
    PrecioTachado crearPrecioTachado(PrecioActual precioActual);
}
