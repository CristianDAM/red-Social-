import java.util.ArrayList;
import java.lang.*;
/**
 * Write a description of class muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class muro
{
    private ArrayList<Entrada> entradas;

    /**
     * Constructor for objects of class muro
     */
    public muro()
    {
        entradas = new ArrayList<>();     
    }

    /**
     * Metodo que premite añadir una entrada de cualquier subclase nuestra ArrayList de entradas
     */
    public void addEntrada(Entrada entrada) 
    {
        entradas.add(entrada);
    }

    public String toString()
    {
        String cadenaADevolver = "";
        for (Entrada entrada : entradas)
        { 
            cadenaADevolver += entrada + "\n";
        }

        return cadenaADevolver;

    }

    /**
     * Metodo que imprime or pantalla nuestro objeto actual
     */
    public void mostrar()
    {
        System.out.println(this);        
    } 

    public void verCantidadDatosPorEntrada()
    {      
        for (Entrada entrada : entradas) { 
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    /**
     * Metodo que imprime por pantalla los datos exclusivos de los post filtrados
     */
    public void mostrarDatosExclusivosEntradasFiltradas(String entradaAFiltrar, String usuarioAFiltrar)
    {

        for (Entrada entrada : entradas) { 
            String nombreClase = entrada.getClass().getSimpleName();
            String usuarioFiltro = entrada.getUsuario();

            if (nombreClase.equals(entradaAFiltrar)  || entradaAFiltrar == null){      
                if(usuarioFiltro.equals(usuarioAFiltrar) || usuarioAFiltrar == null)
                {
                    if(entrada instanceof EntradaTexto)
                    {
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }
                    if(entrada instanceof EntradaFoto)
                    {
                        ((EntradaFoto) entrada).mostrarDatosExclusivos();
                    }
                    if(entrada instanceof EntradaUnionAGrupo)
                    {
                        ((EntradaUnionAGrupo) entrada).mostrarDatosExclusivos();
                    }
                }
            }
        }
    }
}
