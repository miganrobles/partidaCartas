import java.util.ArrayList;
/**
 * Clase Jugador para nuestra partida de cartas
 *
 * @author (your name) 
 * @version (a version number or a date)
 * Clase Jugador
 */
public class Jugador
{
    // Atributo que almacena el identificador del jugador
    private int id;
    // Atributo que almacena las cartas que tiene el jugador en su poder
    private ArrayList<Carta> cartas;
    
    /**
     * Constructor de la clase Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartas = new ArrayList<>();
    }
    
    /**
     * Devuelve el identificador del jugador
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Agrega la carta a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);
    }
    
    /**
     * Devuelve una colección de cadenas con los nombres de las cartas que tiene el jugador
     */
    public ArrayList<String> cartasQueTieneEnLaMano()
    {
        ArrayList<String> cartasTiene = new ArrayList<>();
        for (Carta carta : cartas) {
            cartasTiene.add(carta.getNombre());
        }
        return cartasTiene;
    }
}