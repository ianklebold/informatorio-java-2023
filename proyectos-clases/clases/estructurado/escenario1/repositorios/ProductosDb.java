package clases.estructurado.escenario1.repositorios;

public class ProductosDb {
    public static Integer[] dameLosPreciosDeProductos(){
        Integer[] preciosProductos = new Integer[17];

        preciosProductos[0] = 1500;
        preciosProductos[1] = 800;
        preciosProductos[2] = 3000;
        preciosProductos[3] = 200;
        preciosProductos[4] = 300;
        preciosProductos[5] = 1200;
        preciosProductos[6] = 50;
        preciosProductos[7] = 500;
        preciosProductos[8] = 60;
        preciosProductos[9] = 20;
        preciosProductos[10] = 600;
        preciosProductos[11] = 150;
        preciosProductos[12] = 15;
        preciosProductos[13] = 100;
        preciosProductos[14] = 10;
        preciosProductos[15] = 20;
        preciosProductos[16] = 400;

        return preciosProductos;
    }

    public static String[][] dameLosProductos(){
        String[][] productos = new String[17][3];

        productos[0][0] = "Sable de luz de Anakin Skywalker";
        productos[1][0] = "Casco de Boba Fett";
        productos[2][0] = "Traje de Stormtrooper";
        productos[3][0] = "Lego Millenium Falcon";
        productos[4][0] = "Estrella de la muerte en Lego";
        productos[5][0] = "Halcón Milenario de control remoto";
        productos[6][0] = "Figura de acción de Darth Vader";
        productos[7][0] = "X-wing de Luke Skywalker";
        productos[8][0] = "Libro de arte de Star Wars";
        productos[9][0] = "Poster de Star Wars";
        productos[10][0] = "Casco de Darth Vader";
        productos[11][0] = "Nave de Kylo Ren en Lego";
        productos[12][0] = "Taza de R2-D2";
        productos[13][0] = "Guantes de Darth Vader";
        productos[14][0] = "Funko Pop de Yoda";
        productos[15][0] = "Poster de Darth Vader";
        productos[16][0] = "Nave Slave I de Boba Fett";

        productos[0][1] = "Réplica exacta del sable de luz utilizado por Anakin Skywalker. Incluye sonidos y efectos de luz.";
        productos[1][1] = "Réplica del icónico casco de Boba Fett, con detalles precisos y visor ajustable.";
        productos[2][1] = "Traje completo de Stormtrooper, hecho a medida y con detalles precisos. Incluye casco, armadura, guantes y botas.";
        productos[3][1] = "Juego de construcción de la famosa nave de Han Solo. Incluye miniaturas de los personajes de la película.";
        productos[4][1] = "Juego de construcción de la Estrella de la Muerte, con detalles precisos y miniaturas de naves y personajes de la película.";
        productos[5][1] = "Réplica a escala del Halcón Milenario, con control remoto y efectos de luz y sonido.";
        productos[6][1] = "Figura de acción de alta calidad de Darth Vader, con detalles precisos y accesorios intercambiables.";
        productos[7][1] = "Modelo a escala del X-wing utilizado por Luke Skywalker, con detalles precisos y efectos de luz y sonido.";
        productos[8][1] = "Libro de arte de la saga de Star Wars, con ilustraciones y bocetos de personajes, naves y escenarios de la película.";
        productos[9][1] = "Poster a todo color de la saga de Star Wars, con diseños originales y detalles precisos.";
        productos[10][1] = "Réplica del icónico casco de Darth Vader, con detalles precisos y sistema de voz y respiración integrado.";
        productos[11][1] = "Juego de construcción de la nave de Kylo Ren, con detalles precisos y miniaturas de personajes de la película.";
        productos[12][1] = "Taza de cerámica con diseño de R2-D2 y detalles precisos. Ideal para los fans de la saga.";
        productos[13][1] = "Réplica de los guantes utilizados por Darth Vader, con detalles precisos y fabricados con materiales de alta calidad.";
        productos[14][1] = "Figura de vinilo de Yoda, de la línea Funko Pop, con diseño caricaturesco y detalles precisos.";
        productos[15][1] = "Poster a todo color de Darth Vader, con diseños originales y detalles precisos";
        productos[16][1] = "Modelo a escala de la nave Slave I, utilizada por Boba Fett, con detalles precisos y miniaturas de personajes de la película.";

        productos[0][2] = "Juguetes";
        productos[1][2] = "Coleccionables";
        productos[2][2] = "Ropa y disfraces";
        productos[3][2] = "Juguetes";
        productos[4][2] = "Juguetes";
        productos[5][2] = "Juguetes";
        productos[6][2] = "Juguetes";
        productos[7][2] = "Coleccionables";
        productos[8][2] = "Libros y revistas";
        productos[9][2] = "Decoración";
        productos[10][2] = "Coleccionables";
        productos[11][2] = "Juguetes";
        productos[12][2] = "Cocina y hogar";
        productos[13][2] = "Ropa y disfraces";
        productos[14][2] = "Juguetes";
        productos[15][2] = "Decoración";
        productos[16][2] = "Coleccionables";

        return productos;
    }
}
