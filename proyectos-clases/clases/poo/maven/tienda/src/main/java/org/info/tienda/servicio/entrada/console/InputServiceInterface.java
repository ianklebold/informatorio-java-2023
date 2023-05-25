package org.info.tienda.servicio.entrada.console;

import java.util.Scanner;

public interface InputServiceInterface {
    void createScanner(); //Firmas
    Scanner getScanner();
    void closeScanner();
}
