package clases.imperativa.datatypes;

public class DataTypes {
    //Clasificacion:
    /*
     * ->Primitives
     *           int
     *           byte
     *           short
     *           int   --> Pueden ser, decimal, 
     *                                 octal (Comienzan por cero con caracteres del 0-7), 
     *                                 hexadecimal(Comienzan por cero y X con caracteres del 0-F) 
     *                                 binario (Comienzan con 0b y luego la combinacion de 0 y/o 1)
     *           long
     *           float
     *           double
     *           char
     * 
     *->Objects
     */


    public static void main(String[] args) {
    
        //Los literales enteros y decimales se puede utilizar _ 
        int n = 2_345;
        double x = 45.2_345;
        System.out.println("Entero literal con _ "+n);
        System.out.println("Double con _ "+x);

        //Sin embargo lo siguiente no esta permitido:
        /*
        * int n = _345;
        * double d= 45._9;
        * long ln= 234_;
        */
        conversionTypes();
    }



    public static void conversionTypes() {

        double z = 43.2;
        //Float is of size 32 bits while double is of size 64 bits
        /*
         * Todos los tipos primitivos son convertribles en otros, salvo boolean
         * Todos los tipos de datos pueden convertirse a traves de CASTING excepto Boolean, boolean no se puede!
         */

        //promocion, es cuando realizamos asignaciones
        int x=45;
        double n =x;
        
        //Contraccion
        int y = (int)z; //casting    


        int valueContraccion = (int) 2.50;

        //Implicita
        double valueImplicita = 10 +  20.5d;
    }


}
