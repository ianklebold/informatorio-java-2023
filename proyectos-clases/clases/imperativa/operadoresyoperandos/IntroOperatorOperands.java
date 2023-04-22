package clases.imperativa.operadoresyoperandos;

public class IntroOperatorOperands {
    public static void main(String[] args) {

        //Declaracion e inicializacion
        int valorInicio = 10;

        //Declaracion e inicializacion multiple
        int valorA,valorB,valorC = 15;

        //Mostrar ejercicios de CHAT GPT

        int resultado = 5 + 3 * 2;
        String expresion1 = " 5 + 3 * 2";
        /*
         * Solución:

            Para resolver esta expresión, primero debemos tener en cuenta la precedencia de los operadores. 
            En este caso, el operador * tiene mayor precedencia que el operador +, 
            por lo que se evalúa primero la multiplicación y luego la suma.


         */
        System.out.println("Resultado es : " + resultado);


        int resultado2 = 20 / 4 * 2 + 3;
        String expresion2 = " 20 / 4 * 2 + 3";
        /*
         * Para resolver esta expresión, debemos tener en cuenta tanto la precedencia como la asociatividad de los operadores. 
         * En este caso, tanto el operador / como el operador * tienen la misma precedencia, pero se evalúan de izquierda a derecha, es decir, 
         * siguiendo la asociatividad izquierda-derecha.
         */
        System.out.println("Resultado es : " + resultado2);

        int resultado3 = 2 + 4 * 6 / 3 - 1;
        String expresion3 = "2 + 4 * 6 / 3 - 1";
        /*
         * Para resolver esta expresión, debemos tener en cuenta tanto la precedencia como la asociatividad de los operadores. 
         * En este caso, tanto el operador / como el operador * tienen la misma precedencia, pero se evalúan de izquierda a derecha, es decir, 
         * siguiendo la asociatividad izquierda-derecha.
         * 
         * Primero se evalúa la multiplicación (4 * 6), que da como resultado 24. 
         * Luego se divide por 3, para obtener 8. Luego se suma 2, para obtener 10. Finalmente, se resta 1, para obtener 9.
         */
        System.out.println("Resultado es : " + resultado3);

        System.out.println("Resultado es : " + 5 + 5);
        System.out.println("Resultado es : " + 5 / 5);

        int value1 = 5;
        int value2 = 4;

        System.out.println("Resultado es :"+ value1++ / (3 - value2--));


        System.out.println("\n");
        System.out.printf("Expresion 1 (%s) > Resultado : %d \n Expresion 2 (%s) >  Resultado : %d \n Expresion 3 (%s) > Resultado : %d\n",expresion1,resultado,expresion2,resultado2,expresion2,resultado3);

    }
}
