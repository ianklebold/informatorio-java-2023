package clases.imperativa;

public class ConversionDatos {
    public static void main(String[] args) {
        //Promocion
        int value1 = 5;
        System.out.println("Valor por promocion " + value1);

        //Contraccion
        int value2 = (int)5.23f; //Parsing
        System.out.println("Valor por contraccion " + value2);

        //Implicita
        double value3 = 10 + 20.5d;
        System.out.println("Valor por contraccion " + value3);

        //Salto de linea
        System.out.println("Hola y \n" + "Chau!");          
        
        //Investigar
        System.out.printf("Hola %s %d","Hola mi edad : ",23);
    }
}
