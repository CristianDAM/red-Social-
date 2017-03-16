import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class entradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends ClaseConComentario
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


   
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "Usuario: " +  getUsuario() + "\n";
        cadenaADevolver += tituloImagen + "\n";
        cadenaADevolver += urlImagen + "\n";
        cadenaADevolver += getCantidadMeGusta() + "me gusta";

        long segundosQueHanPasadoDesdeLaCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeLaCreacion = segundosQueHanPasadoDesdeLaCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeLaCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if(segundosQueHanPasadoDesdeLaCreacion > 0) 
        {
            cadenaADevolver += minutosQueHanPasadoDesdeLaCreacion + "minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        if (getComentarios().isEmpty())
        {
            cadenaADevolver += "La entrada no tiene comentarios";
        }
        else {
            // Se recopilan los comentarios 
            for (String cometario : getComentarios()) {
                cadenaADevolver += getComentarios() + "\n";
            }

            cadenaADevolver += getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
          
        }
          return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
        
    }
    
}
