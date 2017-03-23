import java.util.ArrayList;  
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class entradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  EntradaTexto  extends EntradaConComentario
{

    private String mensaje;

    /**
     * Constructor for objects of class entradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super( autor);
        mensaje = texto;
    }

    /**
     * Metodo que devuelve por pantalla el mensaje 
     */
    public String getMensaje()
    {

        return mensaje;

    }

    @Override 
    public String toString()
    {
        String cadenaADevolver = "";

        cadenaADevolver +=    super.toString();

        cadenaADevolver += mensaje + "\n";

        return cadenaADevolver;
    }

    /**
     * Metodo que imprime or pantalla nuestro objeto actual
     */
    public void mostrar()
    {
        System.out.println(this);

    }
    
    /**
     * Metodo que devuelve la cantidad de datos de una entrada
     */
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
           return 5;
    }
}