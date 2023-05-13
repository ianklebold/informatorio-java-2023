package clases.poo.escenario2;


import clases.poo.escenario2.dominio.Categoria;
import clases.poo.escenario2.dominio.PrecioActual;
import clases.poo.escenario2.dominio.PrecioTachado;
import clases.poo.escenario2.dominio.Producto;
import clases.poo.escenario2.inicializacion.InitService;

import java.time.LocalDateTime;
import java.util.*;

public class App {

    //Atributo global
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        InitService.cargarProductos();
        mostrarProductosMasCaros();
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

        //Cargar categoria
        //System.out.println("INGRESE LA CATEGORIA : ");
        //String nombreCategoria = getScanner().nextLine();

        //Consultar si categoria es nulo, si es nulo informar por pantalla y volver a preguntar por la categoria
        Categoria categoria = InitService.categorias.get("Juguete");

        productoNuevo.setCategoria(categoria);
        categoria.getListaProductos().add(productoNuevo);

        System.out.println("Categoria asignada : "+productoNuevo.getCategoria().getNombre());
        System.out.println("Productos de la categoria : "+categoria.getListaProductos());

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
            int descuento = (int) (100 - ((precioActual/precioTachado) * 100)) ;
            productoNuevo.setDescuento(descuento);
        }

        InitService.productos.add(productoNuevo);

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


    //Crear categoria
    //Construir la categoria
    //Instanciar la categoria
    private static Categoria crearCategoria(){
        Categoria categoria = new Categoria();


        //Mandan scanner
        categoria.setNombre("Categoria Random");
        categoria.setDescripcion("Descripcion cualquiera");
        categoria.setEstaElProductoDisponible(true);


        return categoria;
    }

    private static void mostrarProductosMasCaros(){
        List<Producto> productos = buscarProductosMasCaros(InitService.productos);

        System.out.println("\n\t\t*********************************");
        System.out.println("\n\n\t*          PRODUCTOS MAS CAROS       *");
        System.out.println("\n\t\t*********************************\n\n");

        System.out.printf("%-40s%-130s%-40s%-20s%-20s%-20s%n","NOMBRE","DESCRIPCION","CATEGORIA","PRECIO EN LINEA","PRECIO TACHADO","DESCUENTO");

        //Nuevo bucle for, llamado For each // Ejemplo = [PRODUCTO1, NULL, PRODUCTO3]
        for (Producto producto:productos) {

            String categoria;
            if (producto.getCategoria() != null){
                //Guardo el nombre de la categoria
                categoria = producto.getCategoria().getNombre();
            }else {
                categoria = "-";
            }

            String precioTachado;
            if (producto.getPrecioTachado() != null){
                //Clases Wrapper
                precioTachado = Double.toString(producto.getPrecioTachado().getValor());
            }else {
                precioTachado = "-";
            }

            String precioOnline = Double.toString(producto.getPrecioActual().getValor());

            String descuento = Integer.toString(producto.getDescuento());

            System.out.printf("%-40s%-130s%-40s%-20s%-20s%-20s%n",producto.getNombre(),producto.getDescripcion(),categoria,precioOnline,precioTachado,descuento);
        }

    }

    private static List<Producto> buscarProductosMasCaros(List<Producto> productos){

        //Lista de productos
        List<Producto> productosLinked = new LinkedList<>(productos);

        //Lista de productos mas caros
        List<Producto> productoList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            double precioActual = Double.MIN_VALUE;

            //Producto mas caro por vuelta
            Producto productoElegido = null;

            //Posicion del producto mas caro
            int posicion = 0;

            for (int j = 0; j < productosLinked.size(); j++) {

                Producto productoDelCiclo = productosLinked.get(j);

                PrecioActual precioActualDelCiclo = productoDelCiclo.getPrecioActual();

                double valorDelPrecio = precioActualDelCiclo.getValor();

                if(  valorDelPrecio    >= precioActual){
                    productoElegido = productosLinked.get(j);
                    precioActual = productosLinked.get(j).getPrecioActual().getValor();
                    posicion = j;
                }
            }
            //Elimino producto para no tenerlo en cuenta de nuevo
            productosLinked.remove(posicion);

            //Agregarlo a lista de productos mas caros
            productoList.add(productoElegido);
        }

        return productoList;
    }




    public static Scanner getScanner() {
        return scanner;
    }
}
