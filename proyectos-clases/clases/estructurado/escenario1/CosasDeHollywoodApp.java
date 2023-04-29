package clases.estructurado.escenario1;

import clases.estructurado.escenario1.repositorios.ProductosDb;

import java.util.Arrays;

public class CosasDeHollywoodApp {
    public static void main(String[] args) {
        //Declaracion de arreglos
        String[][] productos = new String[17][3];
        Integer[]  preciosProductos = new Integer[17];

        productos = ProductosDb.dameLosProductos();
        preciosProductos = ProductosDb.dameLosPreciosDeProductos();

        /*
        La empresa quiere que se muestre un encabezado y luego listar los artículos más
        baratos (hasta 3) seguido de los nombres de cada uno de estos, más su precio y
        una breve descripción, se debe realizar lo mismo para los artículos más caros (hasta 3).
         */

        //Por default se inicializa en ceros
        int[] preciosBaratosPosicion = {0,0,0};

        //Es el precio menor por cada ciclo en preciosProductos
        int precioMenor;
        boolean fueTratado = false;
        //Encontramos los tres mas baratos
        //Cada ciclo se guarda la posicion del precio mas barato
        for (int i = 0; i < 3; i++) {
            precioMenor = Integer.MAX_VALUE;
            for (int j = 0; j < preciosProductos.length; j++) {
                //Si el precio que estoy analizando en ese ciclo es menor precioMenor
                if (preciosProductos[j] <= precioMenor){
                    //Antes de pasar a guardar, verificar si producto fue tratado
                    for (int k = 0; k < 3; k++) {
                        if (preciosBaratosPosicion[k] == j){
                            //fue tratado
                            fueTratado = true;
                        }
                    }

                    if (!fueTratado){
                        //Guardamos precios barato
                        //Actualizar el precioMenor
                        precioMenor = preciosProductos[j];
                        //Guardamos la posicion del producto mas barato
                        preciosBaratosPosicion[i] = j;
                    }
                    //Reseteamos valor de fueTratado
                    fueTratado = false;
                }
            }
        }

        System.out.println("\n\t\t\t\t*********************************");
        System.out.println("\n\n\t*          PRODUCTOS STAR WARS          *");
        System.out.println("\n\t\t\t\t*********************************");

        System.out.printf("%-40s%-10s%-50s%n","NOMBRE","PRECIO","DESCRIPCION");
        for (int i = 0; i < preciosBaratosPosicion.length; i++) {
            int pos = preciosBaratosPosicion[i];
            System.out.printf("%-40s%-10d%-50s%n", productos[i][0], preciosProductos[pos], productos[i][2]);
        }

        /*
        La empresa quiere que se muestre un encabezado para listar los artículos de una
        categoría determinada, donde deberá mostrarse, el título de la categoría,
        el nombre del producto, descripción y el precio.
         */

        String categoria = "Juguetes";

        System.out.println("\n\t\t\t\t*********************************");
        System.out.println("\n\n\t*          Categoria "+categoria+"      *");
        System.out.println("\n\t\t\t\t*********************************");

        System.out.printf("%-40s%-10s%-50s%n","NOMBRE","PRECIO","DESCRIPCION");
        for (int i = 0; i < productos.length; i++) {
            if(productos[i][2] == categoria){
                System.out.printf("%-40s%-10d%-50s%n", productos[i][0], preciosProductos[i], productos[i][1]);
            }
        }

    }
}
