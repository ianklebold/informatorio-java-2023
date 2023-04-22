package clases.imperativa.datatypes;

public class Variables {
    //Declaracion
    /*
     * No se pueden utilizar palabras reservadas para java incluido goto para identificar
     * No se puede comenzar por caracter numerico
     * Solo se puede usar letras, numeros. $ y _. 
     */

    //Atributos si se inicializan por defecto. Depende del tipo
    /*
     * enteras con 0
     * Decimales con 0.0
     * Boolean con false
     * char nulo
     * Objeto null
     */
     //Declaracion e inicializacion
    int a = 2;

    //Declaracion multiple
    //Variables de atributo
    int b,c,d;
    
    public void variable1() {
        //Variables no se inicializan por defecto
        int c; //variable local
        int a; //En local tenemos el mismo nombre al del atributo, pero solo tiene un scope a nivel de metodo
        
        a=10;  //Variable del metodo
        this.a = 15; //Atributo de la clase
        //Estos dos ultimos son distintos, una es variable de la clase y otra es del metodo.
    }

    /*
     * Primitive types
     * Variable tiene el valor en si
     * Ante una asignacion a otra variable, lo que se genera es una copia del valor del dato
     */
    int s = 200;


    /*
     * Objects types
     * Variable no guarda el valor del objeto, sino una referencia a él, es decir, guarda la direccion de memoria
     * Ante una asignacion a otra variable, lo que se genera es una referencia al mismo punto de memoria en ambas variables
     */
    Object ob = new Object();




}
