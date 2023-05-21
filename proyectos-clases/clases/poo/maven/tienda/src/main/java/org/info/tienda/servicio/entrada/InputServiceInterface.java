package org.info.tienda.servicio.entrada;

import java.util.Scanner;

public interface InputServiceInterface {

    void createScanner();
    Scanner getScanner();
    void closeScanner();
}
