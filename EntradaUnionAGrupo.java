
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

    @Override 
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();

        cadenaADevolver += "Se ha unido al grupo " + grupo + "\n";

       
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
        return 4;
    }

}
