
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo; 

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor, String grupo)
    {
        super(autor);
        this.grupo = grupo;

    }
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "Usuario: " +  getUsuario() + "\n";
        cadenaADevolver += "se a unido a "+ grupo+ "\n";
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

        cadenaADevolver += getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
          
        return cadenaADevolver;
    
    }

}
