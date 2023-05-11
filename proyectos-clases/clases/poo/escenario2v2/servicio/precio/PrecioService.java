package clases.poo.escenario2v2.servicio.precio;

import clases.poo.escenario2v2.dominio.PrecioActual;
import clases.poo.escenario2v2.dominio.PrecioTachado;

public interface PrecioService {

    PrecioActual crearPrecioActual(double precioNuevo);
    PrecioActual crearPrecioActual();
    PrecioTachado crearPrecioTachado(PrecioActual precioActual);
}
