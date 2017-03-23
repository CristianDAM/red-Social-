
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
     * Metodo que aumenta la cantidad de me gustas
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
        String cadenaADevolver = "";
        cadenaADevolver += "Usuario: " +  getUsuario() + "\n";
        cadenaADevolver += getCantidadMeGusta() + "me gusta\n";

        long segundosQueHanPasadoDesdeLaCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeLaCreacion = segundosQueHanPasadoDesdeLaCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeLaCreacion % 60;

        cadenaADevolver += "Hace ";
        if(segundosQueHanPasadoDesdeLaCreacion > 0) 
        {
            cadenaADevolver += minutosQueHanPasadoDesdeLaCreacion + "minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";

        return cadenaADevolver; 
    }

    /**
     * Metodo que imprime or pantalla nuestro objeto actual
     */
    public void mostrar()
    {

    }
    
       /**
     * Metodo que devuelve la cantidad de datos de una entrada
     */
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 0;   
    }
}
