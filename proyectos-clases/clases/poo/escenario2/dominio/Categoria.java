package clases.poo.escenario2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String descripcion;
    private boolean estaElProductoDisponible;

    private List<Producto> listaProductos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstaElProductoDisponible() {
        return estaElProductoDisponible;
    }

    public void setEstaElProductoDisponible(boolean estaElProductoDisponible) {
        this.estaElProductoDisponible = estaElProductoDisponible;
    }
}
