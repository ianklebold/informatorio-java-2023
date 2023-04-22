package clases.imperativa.datatypes;

public class StringDataType 
{

    public static void main( String[] args )
    {
        //El string no es un tipo de dato primitivo, ya pasa a ser una CLASE
        //La clase string puede ser tan larga como quepa en la memoria. 

        String myString = "This is a String";
        System.out.println("My string is equal to: "+ myString);
        myString = myString + ", and this is more";
        myString = myString + "\u009A9 2022 "; //Podemos usar caracteres unicode
        System.out.println("My string is equal to: "+ myString);

        /**
         * String es inmutable, eso quiere decir que no puedes eliminar caracteres de un string.
         * No puedes cambiar un string luego de ser creado, lo que realmente ocurre cuando modificamos o agregamos
         * un nuevo string, es que SE CREA una nueva cadena.
         */
    }


}
 