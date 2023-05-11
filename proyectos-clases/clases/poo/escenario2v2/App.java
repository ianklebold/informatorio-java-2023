package clases.poo.escenario2v2;


import clases.poo.escenario2v2.servicio.entrada.InputService;
import clases.poo.escenario2v2.inicializacion.InitService;
import clases.poo.escenario2v2.servicio.producto.ServicioProducto;
import clases.poo.escenario2v2.servicio.producto.impl.ServicioProductoImpl;

public class App {

    //Atributo global
    private static final ServicioProducto servicioProducto = new ServicioProductoImpl();

    public static void main(String[] args) {

        InitService.initCategories();

        InputService.createScanner();
        System.out.println(servicioProducto.crearProducto().toString());
        InputService.closeScanner();
    }

}
