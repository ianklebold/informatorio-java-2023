package clases.poo.dominio;

public class Persona {
    private String nombre;

    //Persona tiene un vehiculo
    private Vehiculo vehiculo;

    public Persona(String nombre, Vehiculo vehiculo) {

        setNombre(nombre);
        setVehiculo(vehiculo);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
