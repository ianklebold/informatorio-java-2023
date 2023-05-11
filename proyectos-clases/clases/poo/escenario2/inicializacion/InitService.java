package clases.poo.escenario2.inicializacion;

import clases.poo.escenario2.dominio.Categoria;
import clases.poo.escenario2.inicializacion.constantes.DescripcionesCategorias;

import java.util.HashMap;
import java.util.Map;

public class InitService {

    public static Map<String, Categoria> categorias;

    public static void initCategories(){

        categorias = new HashMap();

        categorias.put("Juguete",new Categoria("Juguetes", DescripcionesCategorias.JUGUETE_DESCRIPCION,true));
        categorias.put("Coleccionables",new Categoria("Coleccionables", DescripcionesCategorias.COLECCIONABLES_DESCRIPCION,true));
        categorias.put("Ropa y disfraces",new Categoria("Ropa y disfraces", DescripcionesCategorias.ROPA_DISFRACES_DESCRIPCION,true));
        categorias.put("Libros y revistas",new Categoria("Libros y revistas", DescripcionesCategorias.LIBRO_NOVELAS_REVISTAS_DESCRIPCION,true));
        categorias.put("Decoracion",new Categoria("Decoracion", DescripcionesCategorias.DECORACION_DESCRIPCION,true));
        categorias.put("Cocina y hogar",new Categoria("Cocina y hogar", DescripcionesCategorias.COCINA_HOGAR,true));


    }


}
