
package mecanografia_interfaz_parte5;

import java.util.List;
import java.util.Random;


public class Mecanografia_interfaz_parte5 {

    
    public static void main(String[] args) {
       
         List<String> pangramas = cargarPangramas("C:\\Users\\PERSONAL\\Desktop\\Clarenss\\Tareas 2023\\Java_Actividad_6_Phishing/pangrams.txt");
        if (pangramas.isEmpty()) {
            System.out.println("Error al cargar los pangramas.");
            return;
        }

        Random random = new Random();
        String pangramaActual = pangramas.get(random.nextInt(pangramas.size()));

    }
    
}
