package org.info.tienda;

import org.info.tienda.bootstrap.BootstrapData;
import org.info.tienda.domain.Producto;
import org.info.tienda.servicio.entrada.console.impl.InputService;
import org.info.tienda.servicio.entrada.file.InputFileService;
import org.info.tienda.servicio.entrada.file.impl.InputFileServiceImpl;
import org.info.tienda.servicio.producto.ServicioProducto;
import org.info.tienda.servicio.producto.impl.ServicioProductoImpl;
import org.info.tienda.servicio.salida.file.OutPutFileService;
import org.info.tienda.servicio.salida.file.impl.OutPutFileServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * JAVA JEDI APP
 *
 */
public class App 
{
    //Atributo global
    private static final ServicioProducto servicioProducto = new ServicioProductoImpl();

    private static final InputFileService inputFileService = new InputFileServiceImpl();

    private static final OutPutFileService outPutFileService = new OutPutFileServiceImpl();

    public static void main( String[] args ) throws IOException {
        BootstrapData.initCategories();
        BootstrapData.cargarProductos();

        String rutaArchivo = "src/main/java/org/info/tienda/resources/productos_entrada.txt";

        List<Producto> listaProductos = inputFileService.loadProductsByFile(rutaArchivo);

        String rutaArchivoSalida = "src/main/java/org/info/tienda/resources/producto_salida.txt";
        outPutFileService.exportProducts(BootstrapData.productos,rutaArchivoSalida);

    }



}
