package clases.imperativa.datatypes;

public class ByteShortLongAndWidth {
    public static void main(String[] args) {
        

        //INTEGER VALUE - 32 bits
        System.out.println("RANGO DEL VALOR ENTERO (" + Integer.MIN_VALUE + " to "+ Integer.MAX_VALUE +")");

        //BYTE VALUE - 8 bits - BUENA IDEA CUANDO EL REQUERIMIENTO ES GUARDAR UN NUMERO Y VOS NO SABES CUANTA MEMORIA TENES
        System.out.println("RANGO DEL VALOR DEL BYTE (" + Byte.MIN_VALUE + " to "+ Byte.MAX_VALUE +")");

        //SHORT VALUE - 16 bits - BUENA IDEA CUANDO EL REQUERIMIENTO ES GUARDAR UN NUMERO Y VOS NO SABES CUANTA MEMORIA TENES
        System.out.println("RANGO DEL VALOR DEL BYTE (" + Short.MIN_VALUE + " to "+ Short.MAX_VALUE +")");
        

        //EL TIPO POR DEFAULT DE UN ENTERO ES int

        int valorEntero;
        long valorLong;

        //Es aceptado igualmente. Sin embargo si se trata de un long es de buena practica poner "L en la expresion
        valorLong = 20;
        valorEntero = 20;

        //Correcto
        valorLong = 20L;

        //LONG TIENE 64 BITS
        System.out.println("RANGO DEL VALOR LONG (" + Long.MIN_VALUE + " to "+ Long.MAX_VALUE +")");

        //DESAFIO CREA 4 VARIABLES
        // UN BYTE QUE PUEDE TENER CUALQUIER NUMERO BYTE VALIDO
        // UN SHORT QUE PUEDE TENER CUALQUIER SHORT VALIDO
        // UN INT QUE PUEDE TENER CUALQUIER INTEGER VALIDO

        // POR ULTIMO CREAR UNA VARIABLE DEL TIPO LONG. ESTA VARIABLE DEBE SER IGUAL A 50.000 SUMADO 10 VECES LA SUMA DE LAS 3 VARIABLES ANTERIORES
        
        byte byteValor = 10;
        short shortValor = 20;
        int intValor = 50;

        long longTotal = 50000L + 10L * (byteValor + shortValor + intValor);
    }
    
}
