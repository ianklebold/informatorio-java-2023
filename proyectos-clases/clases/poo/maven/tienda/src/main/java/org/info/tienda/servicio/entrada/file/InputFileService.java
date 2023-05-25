package org.info.tienda.servicio.entrada.file;

import org.info.tienda.domain.Producto;

import java.util.List;

public interface InputFileService {

    //Cargar productos por archivo
    List<Producto> loadProductsByFile(String rutaArchivo);
}
