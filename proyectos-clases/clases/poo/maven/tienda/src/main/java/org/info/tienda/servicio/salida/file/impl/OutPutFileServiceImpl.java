package org.info.tienda.servicio.salida.file.impl;

import org.info.tienda.domain.Producto;
import org.info.tienda.servicio.salida.file.OutPutFileService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutPutFileServiceImpl implements OutPutFileService {

    @Override
    public void exportProducts(List<Producto> productos, String rutaDeDestino){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDeDestino))){

            for (Producto producto: productos) {

                //Preparamos la linea del archivo
                String linea = producto.getNombre() + ";" +
                         producto.getDescripcion() + ";" +
                        ((producto.getCategoria() != null)?producto.getCategoria().getNombre():"")+ ";" +
                        producto.getDescuento()+ ";" +
                        ((producto.getPrecioActual() != null)?producto.getPrecioActual().getValor():"")+ ";" +
                        ((producto.getPrecioTachado() != null)?producto.getPrecioTachado().getValor():"");

                writer.write(linea); //Escribimos en archivo
                writer.newLine(); //Salto de linea
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
