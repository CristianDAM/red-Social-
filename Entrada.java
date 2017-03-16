
import java.time.LocalDateTime;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private String usuario;
    private int cantidadMeGusta;
    private LocalDateTime momentoPublicacion;
 

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
        cantidadMeGusta = 0;
      
        momentoPublicacion = LocalDateTime.now();

    }

    /**
     * Metodo que devuelve el nombre del usuario
     */
    public String getUsuario()
    {

        return usuario;

    }

    /**
     * Metodo que devuelve por pantalla el momento en el que se eha hecho la publicacion 
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;

    }

    /**
     * Metodo que devuelve la cantidad de me gustas
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }

    /**
     * Metodo que devuelve la cantidad de me gusta 
     */
    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;

    }

 

  

    public String toString()
    {
        return "";
    }

}
