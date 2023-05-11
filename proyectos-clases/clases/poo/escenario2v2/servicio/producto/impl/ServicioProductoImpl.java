package clases.poo.escenario2v2.servicio.producto.impl;

import clases.poo.escenario2v2.dominio.Producto;
import clases.poo.escenario2v2.dominio.PrecioActual;
import clases.poo.escenario2v2.servicio.descuento.DescuentoService;
import clases.poo.escenario2v2.servicio.descuento.impl.DescuentoServiceImpl;
import clases.poo.escenario2v2.servicio.entrada.InputService;
import clases.poo.escenario2v2.servicio.precio.PrecioService;
import clases.poo.escenario2v2.servicio.precio.impl.PrecioServiceImpl;
import clases.poo.escenario2v2.servicio.producto.ServicioProducto;

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
