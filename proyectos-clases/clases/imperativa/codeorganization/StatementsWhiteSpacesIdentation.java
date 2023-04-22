package clases.imperativa.codeorganization;

public class StatementsWhiteSpacesIdentation 
{

    public static void main( String[] args )
    { //Bloque de codigo
                        

        //Todo lo que tenga una asignacion, llamada a metodo, etc y finalice con ; es una declaracion
        int myVariable=50; //Statement es decir declaracion - 50 es la expresion
        
        //Tambien son declaraciones (completas): myvariable++ es una expresion, pero con el ; es una declaracion
        myVariable++;
        myVariable--;
        System.out.println("Esta es tambien una declaracion completa");
        
        //Todo esto es una declaracion. La expresion es kilometers = (100 * 1.609344); , las variables , operadores y valores son expresiones, no tipo de datos.
        double kilometers = (100 * 1.609344); //100 son millas
           
        
        //Recomendado escribir asi en estos casos, porque es mas legible
        System.out.println("Este es"+ //Si no aparece el ; significa que el codigo sigue
                "Otra"+
                "Sentencia mas");
        
        

        //Esto para java sigue siendo valido. Sin embargo no es legible
        int otraVariable = 50; myVariable--; System.out.println("Mi variable = "+myVariable);
        

        //CONCEPTO DE WHITESPACE

        //JAVA IGNORA LOS ESPACIOS EN BLANCO
        int                                                             myVariable2 
        
                        =
                        
                        50
                        ;

        //CONCEPTO DE IDENTACION

        //No legible
double kilometers2 = (100 * 1.609344);

        
    }

}
