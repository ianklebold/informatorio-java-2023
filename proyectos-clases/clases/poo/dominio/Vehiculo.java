package clases.poo.dominio;

public class Vehiculo {

    //Atributos , Caracteristicas
    private String marca = "Valor por default";
    private int cantDeRuedas;
    private boolean esDeCompetencia;
    private boolean alarmaEncendida;
    private String kmMaximo;
    private String kmMinimo;

    private boolean puedoArrancarlo(){
        if (this.alarmaEncendida){
            System.out.println("**SUENA ALARMA**");
        }else {
            System.out.println("**VEHICULO ENCENDIDO**");

        }
        return this.alarmaEncendida;
    }

    public void acelerarVehiculo(){

        boolean resultado = puedoArrancarlo();

        if(!resultado){
            System.out.println("**Acelero vehiculo**");
        }
    }

    //Constructor
    public Vehiculo(String marca,int cantDeRuedas,boolean esDeCompetencia, boolean alarmaEncendida, String kmMaximo, String kmMinimo){
        //Operaciones de inicializacion
        this.marca = marca;
        this.cantDeRuedas = cantDeRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.alarmaEncendida = alarmaEncendida;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    public Vehiculo(String marca, int cantDeRuedas){
        this.marca = marca;
        this.cantDeRuedas = cantDeRuedas;
    }

    //Constructor
    public Vehiculo(){}


    //Mostrar informacion
    public String getMarca(){
        //Return es devolver
        //this.marca apunta al atributo marca
        return this.marca;
    }

    //Guardar informacion
    public void setMarca(String marca){
        //this.marca apunta al atributo
        //marca es la informacion a gurdar
        this.marca = marca;
    }

    public int getCantDeRuedas(){
        return this.cantDeRuedas;
    }

    public void setCantDeRuedas(int cantDeRuedas){
        this.cantDeRuedas = cantDeRuedas;
    }

    public boolean getEsDeCompetencia() {
        return esDeCompetencia;
    }

    public void setEsDeCompetencia(boolean esDeCompetencia) {
        this.esDeCompetencia = esDeCompetencia;
    }

    public boolean getEstaAlarmaEncendida() {
        return alarmaEncendida;
    }

    public void setEstaAlarmaEncendida(boolean alarmaEncendida) {
        this.alarmaEncendida = alarmaEncendida;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }
}
