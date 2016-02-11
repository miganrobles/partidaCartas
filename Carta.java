/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Atributo que contiene el valor de las cartas
    private int valor;
    // Atributo que contiene el palo de las cartas
    private String palo;
    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor,String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }
    
    /**
     * Método que devuele una cadena con el nombre de la carta
     */
    public String getNombre(){
        String nombre = valor + " de " + palo;
        if (valor == 1){
            nombre = "As de " + palo;
        }
        else if (valor == 11){
            nombre = "J de " + palo;
        }
        else if (valor == 12){
            nombre = "Q de " + palo;
        }
        else if (valor == 13){
            nombre = "K de " + palo;
        }
        return nombre;
    }
    
    /**
     * Método que retorna el palo al que pertenece la carta
     */
    public String getPalo(){
        return palo;
    }
    
     /**
     * Método que retorna un entero con el valor de la carta (de 1 a 13)
     */
    public int getValor(){
        return valor;
    }
}