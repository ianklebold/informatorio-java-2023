package clases.imperativa;

public class TernaryOperator {
    public static void main(String[] args) {
        
        boolean esUnAuto = true;

        boolean fueUnAuto = (esUnAuto)?true:false;

        System.out.println(fueUnAuto);
        
        String mensajeAuto = (5 > 2)?"Esta es una cadena si es true":"Esta es una cadena si es false";

        System.out.println(mensajeAuto);

        System.out.println((5 > 2)?100:"Funcion");

    }
}
