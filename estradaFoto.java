import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Write a description of class estradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class estradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDate momentoPublicacion;
    private int cantidaMeGusta;
       private ArrayList<String> comentarios;
  
    /**
     * Constructor for objects of class estradaFoto
     */
    public estradaFoto(String autor, String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        
       
    }

   
}
