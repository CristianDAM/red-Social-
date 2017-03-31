import java.util.ArrayList;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.io.File;
import java.lang.Runtime;

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
        //Recorro la coleccion
        for (Entrada entrada : entradas) { 
            String nombreClase = entrada.getClass().getSimpleName();
            String usuarioFiltro = entrada.getUsuario();
            //Decidimos si la entrada se imprime o no
            if (nombreClase.equals(entradaAFiltrar)  || entradaAFiltrar == null){      

                if(usuarioFiltro.equals(usuarioAFiltrar) || usuarioAFiltrar == null)
                {
                    //Imprimo los datos exclusivos
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

    /**
     * Metodo que nos crea nuestra pagina web
     */
    public void mostrarMuroEnNavegador()
    {

        Path rutaArchivo = Paths.get("PaginaHTML.html");

        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);

            archivo.write("<html>");
            archivo.write("<head>");
            archivo.write("<title>" + "Pagina HTML" + "</title>");
            archivo.write("<link href='estilos.css' rel='stylesheet' type='text/css'>");
            archivo.write("</head>");
            archivo.write("<body background='me_gusta_icono_167_863x680.jpg'>");
            archivo.write("<div id='header'>"); 
            archivo.write(" <h1> Mi Sitio </h1> ");
            archivo.write("</div>");
            archivo.write("<hr style='color: #0056b2;'/>");

            archivo.write(toString());
            archivo.write("</body>");

            archivo.write("</html>");

            archivo.close();
        }
        catch (IOException excepcion) {

            System.out.println(excepcion.toString());
        }
        
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe C:/Users/alumno/Desktop/redSocial/paginaHTML.html");
        }
        catch(IOException excepcion){
            System.out.println(excepcion.toString());
        }

    }
}
