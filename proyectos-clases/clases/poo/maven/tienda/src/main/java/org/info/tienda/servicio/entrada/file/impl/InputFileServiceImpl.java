package org.info.tienda.servicio.entrada.file.impl;

import org.apache.commons.io.FileUtils;
import org.info.tienda.bootstrap.BootstrapData;
import org.info.tienda.domain.Categoria;
import org.info.tienda.domain.Producto;
import org.info.tienda.servicio.entrada.file.InputFileService;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InputFileServiceImpl implements InputFileService {

    @Override
    public List<Producto> loadProductsByFile(String rutaArchivo) {
        //Inicializamos lista de productos
        List<Producto> productos = new ArrayList<>();

        try{
            //Lineas del archivo
            List<String> lineas = FileUtils.readLines(new File(rutaArchivo), StandardCharsets.UTF_8);

            //Cada linea es un producto
            for (String linea: lineas) {
                //Partes de la linea
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String descripcion = partes[1];
                String categoria = partes[2];

                Categoria categoriaObject = BootstrapData.categorias.get(categoria);

                double precioActual = Double.parseDouble(partes[3]);
                double precioTachado = Double.parseDouble(partes[4]);

                Producto producto = new Producto(nombre,descripcion,categoriaObject,precioActual,precioTachado);
                productos.add(producto);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }catch (NullPointerException n){
            System.out.println("Hoal soy un error");
            throw new RuntimeException(n);
        }
        return productos;
    }
}
