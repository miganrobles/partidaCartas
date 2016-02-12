import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // ArrayList que contiene todas las cartas del mazo
    private ArrayList<Carta> mazoDeCartas;
    
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        ArrayList<String> palos = new ArrayList<>(Arrays.asList("picas","corazones","tréboles","diamantes"));
        mazoDeCartas = new ArrayList<>();
        for (String palo : palos) {
            int index = 1;
            while (index <= 13) {
                mazoDeCartas.add(new Carta(index, palo));
                index++;
            }
        }
    }

    /**
     * Metodo que nos dice cuantas cartas quedan en el mazo
     */
    public int quedan()
    {
        return mazoDeCartas.size();
    }
    
    /**
     * Metodo para obtener la primera carta del mazo
     */
    public Carta tomarPrimera()
    {
        Carta primera = null;
        if (!mazoDeCartas.isEmpty()){
            primera = mazoDeCartas.remove(0);
        }
        return primera;
    }
    
    /**
     * Metodo para barajar el mazo
     */
    public void barajar()
    {
        Collections.shuffle(mazoDeCartas);
    }
    
}
