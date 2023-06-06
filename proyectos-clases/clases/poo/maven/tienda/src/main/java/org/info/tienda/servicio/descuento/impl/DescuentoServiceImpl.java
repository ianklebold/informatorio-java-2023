package org.info.tienda.servicio.descuento.impl;

import org.info.tienda.domain.Producto;
import org.info.tienda.servicio.descuento.DescuentoService;
import org.info.tienda.servicio.precio.PrecioService;
import org.info.tienda.servicio.precio.impl.PrecioServiceImpl;

public class DescuentoServiceImpl implements DescuentoService {

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public void generarDescuento(Producto producto) {
        //Precio tachado
        producto.setPrecioTachado(precioService.crearPrecioTachado(producto.getPrecioActual()));

        //Precio con descuento
        producto.setPrecioActual(precioService.crearPrecioActual());

        double precioTachado =  producto.getPrecioTachado().getValor();
        double precioActual = producto.getPrecioActual().getValor();

        //= (1 - (online / tachado)) * 100
        int descuento = calculateDiscount(precioTachado,precioActual);
        producto.setDescuento(descuento);
    }

    private int calculateDiscount(final double  precioTachado, final double precioActual){
        return (int) (100 - ((precioActual*precioTachado) / 100));
    }


}
