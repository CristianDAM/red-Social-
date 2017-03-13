import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Write a description of class entradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class entradaTexto
{
    private String usuario;
    private String mensaje;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    private LocalDate momentoPublicacion; 
    

    /**
     * Constructor for objects of class entradaTexto
     */
    public entradaTexto(String autor, String texto)
    {
        usuario = autor;
        mensaje = texto;

    }
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    public void addComentarios(String text)
    {
        comentarios.add(text);
    
    }
    public String getMensaje()
    {
        return mensaje;
        
    }

}
