import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class entradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  EntradaTexto  extends ClaseConComentario
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

  
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "Usuario: " +  getUsuario() + "\n";
        cadenaADevolver += mensaje + "\n";
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
}