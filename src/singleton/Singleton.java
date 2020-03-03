
package singleton;

import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Singleton {

    public static void main(String[] args) throws IOException {
        
        SoyUnico yo= SoyUnico.getSoyUnicoInstancia("Pedro");
        System.out.println("Yo soy: "+yo.getNombre());
        
        SoyUnico yo1= SoyUnico.getSoyUnicoInstancia("Juan");
        System.out.println("Yo soy: "+yo1.getNombre());
        
         ArrayList<Pelicula> peliculas =new ArrayList<Pelicula>();  
         
         peliculas.add(new Pelicula(1,"fer"));
                    
                    CsvWriter csvwriter = new CsvWriter("C:\\Users\\ProFanor\\Documents\\NetBeansProjects\\CinePelisSeries\\src\\lib\\puto.csv"); 
                    
                    for (Pelicula pelicula : peliculas) {
                        String [] datos = pelicula.getArray();
                        csvwriter.writeRecord(datos);
                    }
                    csvwriter.close();
        
    }
    
}
