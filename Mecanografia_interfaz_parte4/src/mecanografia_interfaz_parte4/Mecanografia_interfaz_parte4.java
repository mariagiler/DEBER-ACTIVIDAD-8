/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanografia_interfaz_parte4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Mecanografia_interfaz_parte4 {

    
    public static void main(String[] args) {
        List<String> pangramas = cargarPangramas("C:\\Users\\PERSONAL\\Desktop\\Clarenss\\Tareas 2023\\Java_Actividad_6_Phishing/pangrams.txt");
        if (pangramas.isEmpty()) {
            System.out.println("Error al cargar los pangramas.");
            return;
        }

        Random random = new Random();
        String pangramaActual = pangramas.get(random.nextInt(pangramas.size()));

        Scanner scanner = new Scanner(System.in);
        int pulsacionesCorrectas = 0;
        int pulsacionesIncorrectas = 0;
        List<Character> teclasDificiles = new ArrayList<>();
    }
    
}
