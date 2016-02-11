import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // ArrayList que contiene todas las cartas del mazo
    private ArrayList<Carta> cartas;
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        cartas = new ArrayList<>();
        int valor = 1;
        String palo = "picas";
        while (valor <= 13){
            cartas.add(new Carta(valor,palo));
            if (valor == 13 && palo.equals("picas")){
                valor = 0;
                palo = "treboles";
            }
            else if (valor == 13 && palo.equals("treboles")){
                valor = 0;
                palo = "diamantes";
            }
            else if (valor == 13 && palo.equals("diamantes")){
                valor = 0;
                palo = "corazones";
            }
            valor = valor + 1;
        }
    }

    /**
     * Metodo que nos dice cuantas cartas quedan en el mazo
     */
    public int quedan(){
        return cartas.size();
    }
    
    /**
     * Metodo para obtener la primera carta del mazo
     */
    public Carta tomarPrimera(){
        Carta primera = null;
        if (cartas.size() >= 1){
            primera = cartas.get(0);
            cartas.remove(0);
        }
        return primera;
    }
    
    /**
     * Metodo para barajar el mazo
     */
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
}
