package clases.poo.escenario2v2.servicio.entrada;

import java.util.Scanner;

public class InputService {
    public static Scanner scanner;

    public static void createScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public static Scanner getScanner(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }

}
