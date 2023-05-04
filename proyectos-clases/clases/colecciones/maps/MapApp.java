package clases.colecciones.maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        hashMapExample();
    }

    private static void hashMapExample(){
        Map<String, String> definiciones = new HashMap<String, String>();

        definiciones.put("Java", "Lenguaje de programación orientado a objetos");
        definiciones.put("Python", "Lenguaje de programación interpretado y dinámico");
        definiciones.put("C++", "Lenguaje de programación de alto rendimiento y eficiencia");

        //For each
        for (Map.Entry<String,String> elemento: definiciones.entrySet()) {
            System.out.println("Clave :"+elemento.getKey() + ", Valor :"+ elemento.getValue());
        }


    }

}
