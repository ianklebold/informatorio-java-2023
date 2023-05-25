package org.info.tienda.servicio.salida.file;

import org.info.tienda.domain.Producto;

import java.io.IOException;
import java.util.List;

public interface OutPutFileService {

    void exportProducts(List<Producto> productos, String rutaDeDestino) throws IOException;

}
