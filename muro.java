 import java.util.ArrayList;
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

  
}
