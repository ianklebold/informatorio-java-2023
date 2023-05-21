package org.info.tienda.domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String descripcion;
    private boolean estaElProductoDisponible;

    private List<Producto> listaProductos = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion, boolean estaElProductoDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estaElProductoDisponible = estaElProductoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto listaProductos) {
        this.listaProductos.add( listaProductos);
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

    @Override
    public String toString() {
        String mostrar="";
        mostrar = "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estaElProductoDisponible=" + estaElProductoDisponible +
                 ", listaDeProductos=[" ;
        for ( int i=0; i < listaProductos.size();i++  ) {
           mostrar = mostrar + listaProductos.get(i).getNombre() + ", ";
        }
        mostrar += "]";
         return mostrar;
    }
}
