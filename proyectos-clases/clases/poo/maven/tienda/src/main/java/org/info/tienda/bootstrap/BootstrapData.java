package org.info.tienda.bootstrap;

import org.info.tienda.bootstrap.constantes.DescripcionesCategorias;
import org.info.tienda.domain.Categoria;
import org.info.tienda.domain.Producto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BootstrapData{
    public static Map<String, Categoria> categorias = new HashMap<>();

    public static List<Producto> productos;


    public static void initCategories(){

        categorias = new HashMap();

        cargarCategorias(categorias);
    }

    public static void cargarProductos(){

        Map<String,Categoria> categoriaMap = new HashMap<>();

        cargarCategorias(categoriaMap);

        productos = List.of(
                new Producto("Sable de luz de Anakin Skywalker","Réplica exacta del sable de luz utilizado por Anakin Skywalker. Incluye sonidos y efectos de luz.",categoriaMap.get("Juguete"),1500,2000),
                new Producto("Casco de Boba Fett","Réplica del icónico casco de Boba Fett, con detalles precisos y visor ajustable.",categoriaMap.get("Coleccionables"),800,0),
                new Producto("Traje de Stormtrooper","Traje completo de Stormtrooper, hecho a medida y con detalles precisos. Incluye casco, armadura, guantes y botas.",categoriaMap.get("Ropa y disfraces"),3000,5000),
                new Producto("Lego Millenium Falcon","Juego de construcción de la famosa nave de Han Solo. Incluye miniaturas de los personajes de la película.",categoriaMap.get("Juguetes"),200,300),
                new Producto("Estrella de la muerte en Lego","Juego de construcción de la Estrella de la Muerte, con detalles precisos y miniaturas de naves y personajes de la película.",categoriaMap.get("Juguete"),300,0),
                new Producto("Halcón Milenario de control remoto","Réplica a escala del Halcón Milenario, con control remoto y efectos de luz y sonido.",categoriaMap.get("Juguete"),1200,1500),
                new Producto("Figura de acción de Darth Vader","Figura de acción de alta calidad de Darth Vader, con detalles precisos y accesorios intercambiables.",categoriaMap.get("Juguete"),50,100),
                new Producto("X-wing de Luke Skywalker","Modelo a escala del X-wing utilizado por Luke Skywalker, con detalles precisos y efectos de luz y sonido.",categoriaMap.get("Juguete"),250,500),
                new Producto("Libro de arte de Star Wars","Libro de arte de la saga de Star Wars, con ilustraciones y bocetos de personajes, naves y escenarios de la película.",categoriaMap.get("Coleccionables"),60,0),
                new Producto("Poster de Star Wars","Poster a todo color de la saga de Star Wars, con diseños originales y detalles precisos.",categoriaMap.get("Libros y revistas"),20,0),
                new Producto("Casco de Darth Vader","Réplica del icónico casco de Darth Vader, con detalles precisos y sistema de voz y respiración integrado.",categoriaMap.get("Decoracion"),600,0),
                new Producto("Nave de Kylo Ren en Lego","Juego de construcción de la nave de Kylo Ren, con detalles precisos y miniaturas de personajes de la película.",categoriaMap.get("Coleccionables"),150,347),
                new Producto("Taza de R2-D2","Taza de cerámica con diseño de R2-D2 y detalles precisos. Ideal para los fans de la saga.",categoriaMap.get("Juguetes"),15,35),
                new Producto("Guantes de Darth Vader","Réplica de los guantes utilizados por Darth Vader, con detalles precisos y fabricados con materiales de alta calidad.",categoriaMap.get("Cocina y hogar"),100,0),
                new Producto("Funko Pop de Yoda","Figura de vinilo de Yoda, de la línea Funko Pop, con diseño caricaturesco y detalles precisos.",categoriaMap.get("Ropa y disfraces"),10,15),
                new Producto("Poster de Darth Vader","Poster a todo color de Darth Vader, con diseños originales y detalles precisos.",categoriaMap.get("Juguetes"),20,35),
                new Producto("Nave Slave I de Boba Fett","Modelo a escala de la nave Slave I, utilizada por Boba Fett, con detalles precisos y miniaturas de personajes de la película.",categoriaMap.get("Decoración"),400,500)
        );

    }

    private static void cargarCategorias(Map<String,Categoria> categorias){
        categorias.put("Juguete",new Categoria("Juguetes", DescripcionesCategorias.JUGUETE_DESCRIPCION,true));
        categorias.put("Coleccionables",new Categoria("Coleccionables", DescripcionesCategorias.COLECCIONABLES_DESCRIPCION,true));
        categorias.put("Ropa y disfraces",new Categoria("Ropa y disfraces", DescripcionesCategorias.ROPA_DISFRACES_DESCRIPCION,true));
        categorias.put("Libros y revistas",new Categoria("Libros y revistas", DescripcionesCategorias.LIBRO_NOVELAS_REVISTAS_DESCRIPCION,true));
        categorias.put("Decoracion",new Categoria("Decoracion", DescripcionesCategorias.DECORACION_DESCRIPCION,true));
        categorias.put("Cocina y hogar",new Categoria("Cocina y hogar", DescripcionesCategorias.COCINA_HOGAR,true));
    }



}
