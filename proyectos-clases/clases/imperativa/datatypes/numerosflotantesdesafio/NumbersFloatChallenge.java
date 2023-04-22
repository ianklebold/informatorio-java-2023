package clases.imperativa.datatypes.numerosflotantesdesafio;

public class NumbersFloatChallenge {
    public static void main(String[] args) {
        
        int miValorEntero = 5 / 2;

        float miValorFlotante = 5f / 2f;

        double miValorDouble = 5d / 2d; 

        //El valor se trunca a 1. Se pierde informacion.
        miValorEntero = 5 / 3;

        //No se pierde informacion
        miValorFlotante = 5f / 3f;
        
        //No se pierde informacion y el valor es mas preciso. Double es una gran alternativa al tratarse de guardar montos de dinero por ejemplo
        miValorDouble = 5d / 3d;


        double numberOfPounts = 200d;
        double convertedKilograms = numberOfPounts * 0.45359237d;
        System.out.println("Converted to kilograms : "+convertedKilograms);


    }
}
