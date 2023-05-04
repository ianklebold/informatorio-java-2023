package clases.poo;

import clases.poo.dominio.Persona;
import clases.poo.dominio.Vehiculo;

public class AppVehiculos {
    public static void main(String[] args) {
        //Instanciamos
        Vehiculo autito = new Vehiculo("BMW",4,false,true,"0","2000");
        Vehiculo autito2 = new Vehiculo("Audi",4,true,false,"100","2000");
        Vehiculo autito3 = new Vehiculo("Toyota",4,false,true,"0","500");

        /*
        Vehiculo[] vehiculos = {autito,autito2,autito3};


        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].acelerarVehiculo();
        }
        */
        Persona persona1 = new Persona("Ian",autito2);
        Persona persona2 = new Persona("Jorge",autito);

        Persona[] personas = {persona1,persona2};

        for (int i = 0; i < personas.length; i++) {
            personas[i].getVehiculo().acelerarVehiculo();
        }



    }
}
