package clases.estructurado.condicionales;

public class EstructuraElseIf {
    public static void main(String[] args) {
        
        boolean esUnDiaLluvioso = true;
        final String DAY = "Sabado";

        if(esUnDiaLluvioso){
            System.out.println("Hoy es :" + DAY + " Y esta lloviendo");
        }else{
            System.out.println("Hoy es :" + DAY + " Y no esta lloviendo");
        }
        
        System.out.println("Esto es codigo extra");

        if(esUnDiaLluvioso && DAY == "Martes"){
            System.out.println("Hoy es :" + DAY + " Y esta lloviendo");
        }else if (esUnDiaLluvioso == false) {
            System.out.println("Hoy es :" + DAY + " Y no esta lloviendo" );
        }else{
            System.out.println("Hoy es martes por lo que no tenemos informacion del clima de hoy");
        }

        if(esUnDiaLluvioso){
            System.out.println("LLEVATE EL PARAGUAS!");
            if(DAY == "Lunes" || DAY == "Martes"){
                System.out.println("Hoy es :" + DAY + " te espera un dia lluvioso");
            }else{

                if(DAY == "Miercoles"){

                    System.out.println("Mejora el clima, va salir el sol");

                }else if(DAY == "Jueves"){

                    System.out.println("Dia muy humedo y caluroso");

                }else if(DAY == "Viernes"){

                    System.out.println("Dia caluroso");

                }else{
                    System.out.println("No tengo el clima para el sabado ni domingo");
                }

            }
        }


    }
}
