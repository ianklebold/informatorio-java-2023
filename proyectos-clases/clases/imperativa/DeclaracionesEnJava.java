package clases.imperativa;

public class DeclaracionesEnJava {
    public static void main(String[] args) {
        

        float valor1 = 34.5f;

        double valor2 = 50.2;        

        //SENTENCIA long valueLong = 123;
        //EXPRESION 1234 * 5
        long valueLong = 1234 * 5;
        
        valueLong = 2134;
        

        //CONSTANTE
        final char constanteValue = '\u0044';
        
        //CONTADORES
        int valueA = 10;


        System.out.println(valueA++); //valueA = valueA + 1
        System.out.println(valueA--); //valueA = valueA  -1

        //ACUMULADORES valueA = valueA + 5
        System.out.println("Acumulador " + (valueA += 5)); //Es igual a valueA = valueA + 5
        System.out.println( "Desacumulador " + (valueA -= 10)); //Es igual a valueA = valueA - 10


        System.out.println(constanteValue);
    }
}
