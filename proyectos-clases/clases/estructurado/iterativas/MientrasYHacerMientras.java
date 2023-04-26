package clases.estructurado.iterativas;

public class MientrasYHacerMientras {
    public static void main(String[] args) {
        
        //MIENTRAS Y HACER MIENTRAS --> NO SE CUANTAS VECES VOY A ITERAR

        int contador = 1;
        while (contador < 10){
            System.out.println("Hello! soy el numero " + contador);
            break;
        }

        do {
            
            System.out.println("Adios! soy el numero " + contador);
            contador--;
        }while (contador == 0);

        System.out.println("SELECCIONE UNA OPCION");
        String opcion = "4";
        do{
            //MEJORAR ESTO CON FOR
            System.out.println("OPCION 1");
            System.out.println("OPCION 2");
            System.out.println("OPCION 3");
            System.out.println("OPCION 4");

            switch (opcion){
                case "1":
                case "2":
                case "3": 
                case "4":
                    System.out.printf("Elegiste la opcion %s!",opcion);
                    System.out.println("\n");
            }

        }while (opcion != "4");
        
    }

}
