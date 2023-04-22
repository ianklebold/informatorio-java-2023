package clases.imperativa.datatypes;

public class CharBooleanPrimitive 
{

    public static void main( String[] args )
    {
        //El char tiene un ancho de 16 bits no 8 bits, ya que permite guardar la codificacion UNICODE.
        char oneChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(oneChar);
        System.out.println(myUnicodeChar);


        char myCopyrigthChar = '\u00A9';
        System.out.println(myCopyrigthChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
    }


}
 