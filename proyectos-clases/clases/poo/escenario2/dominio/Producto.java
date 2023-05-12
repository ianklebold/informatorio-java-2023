package clases.poo.escenario2.dominio;

import clases.poo.escenario2.App;

import java.util.UUID;

public class Producto {

    private UUID id;

    private String nombre;

    private String descripcion;

    private Categoria categoria;

    private int descuento;

    private PrecioActual precioActual;

    private PrecioTachado precioTachado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public PrecioActual getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(PrecioActual precioActual) {
        this.precioActual = precioActual;
    }

    public PrecioTachado getPrecioTachado() {
        return precioTachado;
    }

    public void setPrecioTachado(PrecioTachado precioTachado) {
        this.precioTachado = precioTachado;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria+
                ", descuento=" + descuento +
                ", precioActual=" + precioActual +
                ", precioTachado=" + precioTachado +
                '}';
    }
}
