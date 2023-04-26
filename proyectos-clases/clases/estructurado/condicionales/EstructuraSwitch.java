package clases.estructurado.condicionales;

public class EstructuraSwitch {
    public static void main(String[] args) {
        /* 
        String curso = "Java";

        final String MENSAJE_BIENVENIDA = "Bienvenido al curso de ";
        final String CURSO_DE_PYTHON = "Python";
        final String CURSO_DE_JAVA = "Java";
        final String CURSO_DE_TESTING = "Testing";

        switch (curso){
            case CURSO_DE_PYTHON:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_PYTHON);
                System.out.println("Que te diviertas");
                break;
            case CURSO_DE_JAVA:
            case CURSO_DE_TESTING:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_TESTING + " y " + CURSO_DE_JAVA);
                break;
            default:
                System.out.println("El curso ingresado no existe");
        }
        */
        int calificacion1 = 10;
        int calificacion2 = 6;
        
        switch ((calificacion1 + calificacion2) / 2){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("DESAPROBADO!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("APROBADO!");
                break;
            default:
                System.out.println("Calificaciones invalidas");
        }
        
    }
}
