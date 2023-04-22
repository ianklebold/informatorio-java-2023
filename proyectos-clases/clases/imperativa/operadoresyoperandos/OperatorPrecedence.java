package clases.imperativa.operadoresyoperandos;

public class OperatorPrecedence {
    
        /**
         * author : if
         * 
         * **/
    public static void main(String[] args) {
        
        /**
         * 
         * Lo siguiente esta ordenado desde lo mas importante para java (Lo que primero evaluara) hasta lo menos importante
         * https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
         * 
         * **/

        /**
         * 15
         * La evaluacion se realiza de Izquierda a Derecha
          () Parentesis
          [] Corchetes
          .  Operador de seleccion
         * **/     
        
        
        /**
         * 14
          
         * La evaluacion se realiza de Izquierda a Derecha
          
          ++ Operador unario Post-Incremento
          -- Operador unario Post-Decremento
          
         * **/    

        System.out.println("///////////PRESCEDENCIA 14 /////// \n"); 

        int a = 5;
        int b = a++;

        System.out.println("Post Increment :"+"b :" + b+ " : " + "a :" +a);
        /**
            Como vemos primero se asigna y posterior a ello se incrementa
         *  Es por ello que b tiene un valor de 5 y posterior a ello se incrementa "a" al valor de 6
         * **/   

        /**
         13
        * La evaluacion se realiza de Derecha a izquierda
            ++ Operador unario Pre-Incremento
            -- Operador unario Pre-Decremento
            +  Operador unario de suma (Convierte a un numero en positivo)
            -  Operador unario de resta (Convierte a un numero en negativo)
            !  Operador unario de complemento
            ~  Operador de complemento bitwise 
            ( type ) Operador para realizar el casting a una variable
          
         * **/   
        System.out.println("///////////PRESCEDENCIA 13 /////// \n"); 
        a = 5;
        b = --a;

        System.out.println("Pre Increment :"+"b :" + b+ " : " + "a :" +a);
        /**
            Como vemos primero se decrementa el valor de "a" y ese mismo valor es el que luego se asigna a b
         *  Es por ello que a y b tienen el mismo valor.
        * **/   

        int valor = 2;
        System.out.println(-valor); // Imprimirá por pantalla un -2


        /**
         12
        * La evaluacion se realiza de izquierda a Derecha

            * Multiplicacion
            / Division
            % Moudulo

         * **/  

        
        /**
         11
        * La evaluacion se realiza de izquierda a Derecha

            + Suma
            - Resta
        * **/  

        /**
         10
        * La evaluacion se realiza de izquierda a Derecha
          Estos sirven para operar con bits, rara vez se los utiliza, basicamente realizan desplazamientos de numeros binarios
           <<
           >>
           >>>
        * **/          


        /**
         9
        * La evaluacion se realiza de izquierda a Derecha
            < Menor que
            <= Menor igual que
            > Mayor que
            >= Mayor igual que
            instanceof Tipo de comparacion, te devuelve true si un objeto pertenece a una instancia en particular
        * **/  

        /**
         8
        * La evaluacion se realiza de izquierda a Derecha
          
        == Relacional igual a 
        != Relacional no es igual a
        * **/  

        /**
         7
        * La evaluacion se realiza de izquierda a Derecha
          
        & Bitwise AND 

        Este operador no es el AND (&&) este lo que hace es guardar el resultado de una operacion, guardar un 1 o 0
        * **/  

        /**
         6
        * La evaluacion se realiza de izquierda a Derecha
          
        ^ Bitwise Or Exlusivo 

        IDEM 7 pero con or exclusivo
        * **/  

        /**
         5
        * La evaluacion se realiza de izquierda a Derecha
          
        | Bitwise OR 

        IDEM 7 pero con OR
        * **/  


        /**
         4
        * La evaluacion se realiza de izquierda a Derecha
          
        && AND LOGICO

        * **/

        /**
         3
        * La evaluacion se realiza de izquierda a Derecha
          
        || OR LOGICO
        * **/  

        /**
         2
        * La evaluacion se realiza de derecha a izquierda
          
        ?: Condicional ternario
        * **/  

        System.out.println("///////////PRESCEDENCIA 2 /////// \n"); 

        boolean isCar = true;

        boolean wasCar = isCar?true:false;
        System.out.println("Resultado de operador ternario : " + wasCar);
        //El operador ? ternario devolvera dos valores, en caso de que la expresion evaluada sea verdadero devolvera el valor
        //Mas proximo a ? y en caso de ser falso devolvera el valor despues de :

        /**
         1
            = Asignacion
            += Suma y luego asignacion
            -= Resta y luego asignacion
            *= Multiplicacion y luego asignacion
            /= Division y luego asignacion
            %= Modulo y luego asignacion
        * **/          

        int result = 1  ; 
        System.out.println("Result : " + result);

        result += 2; // es lo mismo que result = result + 2;
        System.out.println("+= : " + result);

        result *= 10; // es lo mismo que result = result * 10;
        System.out.println("*= : " + result);

        result /= 2; // es lo mismo que result = result / 2;
        System.out.println("/=  : " + result);
        
        result -= 2; // // es lo mismo que result = result - 2;
        System.out.println("-= : " + result);

        result %= 2; // // es lo mismo que result = result - 2;
        System.out.println("%= : " + result);
    }

}
