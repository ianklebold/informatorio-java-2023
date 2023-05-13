package clases.poo.escenario2.dominio;

import clases.poo.escenario2.App;

import java.time.LocalDateTime;
import java.util.UUID;

public class Producto {

    private UUID id;

    private String nombre;

    private String descripcion;

    private Categoria categoria;

    private int descuento;

    private PrecioActual precioActual;

    private PrecioTachado precioTachado;

    public Producto(String nombre, String descripcion, Categoria categoria, double precioActual, double precioTachado) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;

        if(categoria != null){
            this.categoria.getListaProductos().add(this);

        }
        if(precioTachado != 0){
            this.precioActual = new PrecioActual(precioActual,LocalDateTime.now());
            this.precioTachado = new PrecioTachado(precioTachado,LocalDateTime.now(),null);

            //= (1 - (online / tachado)) * 100
            this.descuento = (int) (100 - ((this.precioActual.getValor()/this.precioTachado.getValor()) * 100));
        }else {
            this.precioActual = new PrecioActual(precioActual,LocalDateTime.now());
            this.descuento = 0;
        }
    }

    public Producto() {}

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
                ", categoria=" + categoria +
                ", descuento=" + descuento +
                ", precioActual=" + precioActual +
                ", precioTachado=" + precioTachado +
                '}';
    }
}
