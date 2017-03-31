import java.util.ArrayList;
/**
 * Write a description of class ClaseConCOmentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentario extends Entrada
{
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class ClaseConCOmentario
     */
    public EntradaConComentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();

    }

    /**
     * Metodo que devuelve los comentarios
     */
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

    @Override 
    public String toString()
    {

        String cadenaADevolver = "";
        cadenaADevolver +=    super.toString();
        if (getComentarios().isEmpty())
        {
            cadenaADevolver +=  "<p class='marco'>" + "La entrada no tiene comentarios.\n" + "</p>"  + "<br/>";
        }
        else {
            // Se recopilan los comentarios 
            cadenaADevolver +=  "<p class='marco'>" +  "Comentarios:\n" + "<br/>";
            for (String cometario : getComentarios()) {
                cadenaADevolver += getComentarios() + "\n" + "</p>"+ "<br/>" + "<hr style='color: #0056b2;'  />" + "<br/>";
            }

        }
        
        return cadenaADevolver;

    }
}
