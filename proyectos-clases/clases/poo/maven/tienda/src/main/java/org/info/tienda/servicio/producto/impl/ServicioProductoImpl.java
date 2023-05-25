package org.info.tienda.servicio.producto.impl;


import org.info.tienda.domain.PrecioActual;
import org.info.tienda.domain.Producto;
import org.info.tienda.servicio.descuento.DescuentoService;
import org.info.tienda.servicio.descuento.impl.DescuentoServiceImpl;
import org.info.tienda.servicio.entrada.console.impl.InputService;
import org.info.tienda.servicio.precio.PrecioService;
import org.info.tienda.servicio.precio.impl.PrecioServiceImpl;
import org.info.tienda.servicio.producto.ServicioProducto;

import java.util.UUID;

public class ServicioProductoImpl implements ServicioProducto {

    private final DescuentoService descuentoService = new DescuentoServiceImpl();

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public Producto crearProducto() {
        Producto productoNuevo = new Producto();

        productoNuevo.setId(UUID.randomUUID());

        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO : ");
        // String nombreProducto = entrada.nextLine(); Es lo mismo
        productoNuevo.setNombre(InputService.scanner.nextLine());
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO : ");
        productoNuevo.setDescripcion(InputService.scanner.nextLine());

        PrecioActual precioActual = precioService.crearPrecioActual();
        productoNuevo.setPrecioActual(precioActual);

        System.out.println("TIENE DESCUENTO? Si ingrese 1 - No ingrese 0: ");
        int quieroDescuento = InputService.scanner.nextInt();

        if (quieroDescuento == 1){
            //Envio de mensaje
            descuentoService.generarDescuento(productoNuevo);
        }

        return productoNuevo;
    }

}
