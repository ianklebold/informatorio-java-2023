package clases.poo.escenario2;


import clases.poo.escenario2.dominio.PrecioActual;
import clases.poo.escenario2.dominio.PrecioTachado;
import clases.poo.escenario2.dominio.Producto;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class App {

    //Atributo global
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(crearProducto().toString());


    }

    private static Producto crearProducto(){
        Producto productoNuevo = new Producto();

        productoNuevo.setId(UUID.randomUUID());

        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO : ");
        // String nombreProducto = entrada.nextLine(); Es lo mismo
        productoNuevo.setNombre(getScanner().nextLine());
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO : ");
        productoNuevo.setDescripcion(getScanner().nextLine());
        productoNuevo.setPrecioActual(crearPrecioActual());

        System.out.println("TIENE DESCUENTO? Si ingrese 1 - No ingrese 0: ");
        int quieroDescuento = getScanner().nextInt();

        if (quieroDescuento == 1){
            //Precio tachado
            productoNuevo.setPrecioTachado(crearPrecioTachado(productoNuevo.getPrecioActual()));

            //Precio con descuento
            productoNuevo.setPrecioActual(crearPrecioActual());

            double precioTachado =  productoNuevo.getPrecioTachado().getValor();
            double precioActual = productoNuevo.getPrecioActual().getValor();

            //= (1 - (online / tachado)) * 100
            int descuento = (int) (100 - ((precioActual*precioTachado) / 100)) ;
            productoNuevo.setDescuento(descuento);
        }

        return productoNuevo;
    }

    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());

        return precioActual;
    }

    private static PrecioTachado crearPrecioTachado(){
        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioTachado.setValor(getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0,0));

        return precioTachado;
    }

    private static PrecioTachado crearPrecioTachado(PrecioActual precioActual){
        PrecioTachado precioTachado = new PrecioTachado();

        precioTachado.setValor(precioActual.getValor());
        precioTachado.setFechaDeCarga(precioActual.getFechaDeCarga());
        precioTachado.setFechaDeFinalizacion(precioActual.getFechaDeCarga());

        return precioTachado;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
