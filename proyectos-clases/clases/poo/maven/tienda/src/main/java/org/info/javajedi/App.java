package org.info.javajedi;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Adios mundo!" );


        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();
        System.out.println( "Hola : " +  nombre);

        scanner.close();
    }
}
