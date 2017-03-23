import java.util.ArrayList; 
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class entradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends EntradaConComentario
{

    private String tituloImagen;
    private String urlImagen;

    /**
     * Constructor for objects of class entradaTexto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;        
        tituloImagen = titulo;    
    }

    /**
     * Metodo que devuelve por pantalla el mensaje 
     */
    public String getUrlImagen()
    {
        return urlImagen;

    }

    /**
     * Metodo que devuelve el titulo de la imagen 
     */
    public String getTituloImagen()
    {
        return tituloImagen;

    }

    @Override 
    public String toString()
    {
     
        String cadenaADevolver = "";
        cadenaADevolver +=    super.toString();

        cadenaADevolver += tituloImagen + "\n";
        cadenaADevolver += urlImagen + "\n";

     
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
        return 6;
    }

}
