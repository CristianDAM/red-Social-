import java.util.ArrayList;
/**
 * Write a description of class ClaseConCOmentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClaseConComentario extends Entrada
{
   private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class ClaseConCOmentario
     */
    public ClaseConComentario(String autor)
    {
        super(autor);
        
         comentarios = new ArrayList<>();
       
    }
    
       public ArrayList<String> getComentarios()
    {
        return comentarios;
    }
    
      /**
     * Metodo que añade a la lista de comentarios un nuevo comentario que se añade pidiendolo por parametro 
     */
    public void addComentarios(String text)
    {
        comentarios.add(text);

    }

}
