package clases.estructurado.iterativas;

public class ManejadoPorContador {
    public static void main(String[] args) {
        
        //BUCLE FOR --> CONOZCO LA CANTIDAD DE VECES A ITERAR
 
        //Declaracion del indice int contador = 1
        //Condicion contador <= 5
        //Inc/Dec  contador++
        for (int contador = 1; contador <= 5; contador++){
            System.out.println(contador);
        }

        boolean activadorDeFor = true;
        for (int contador = 0; contador < 4 && activadorDeFor; contador++){
            System.out.println("Hola!");
        }
        
        for (int i = 1, j = 10; i > j  ;  i++,j--){
            //Nivel de complejidad 1 un solo bucle for
            
            System.out.println(i+"      "+j);
        }
       
        for (int i = 1; i<10 ; i++ ){
            //Nivel de complejidad 2 con dos bucles for anidados
            for (int j = 1; j<10 ; j++){
                System.out.println("Dentro del bucle #"+i+" Soy el elemento #"+j);
            }
        }
        
    }
}
