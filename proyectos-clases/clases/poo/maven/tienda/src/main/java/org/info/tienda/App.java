package org.info.tienda;

import org.info.tienda.bootstrap.BootstrapData;
import org.info.tienda.domain.Precio;
import org.info.tienda.domain.PrecioActual;
import org.info.tienda.domain.PrecioTachado;
import org.info.tienda.servicio.entrada.impl.InputService;
import org.info.tienda.servicio.producto.ServicioProducto;
import org.info.tienda.servicio.producto.impl.ServicioProductoImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * JAVA JEDI APP
 *
 */
public class App 
{
    //Atributo global
    private static final ServicioProducto servicioProducto = new ServicioProductoImpl();

    public static void main( String[] args )
    {

        BootstrapData.initCategories();
        BootstrapData.cargarProductos();

        //Arrancar scanner
        InputService.createScanner();

        System.out.println(servicioProducto.crearProducto().toString());

        //Arrancar scanner
        InputService.closeScanner();


    }



}
