/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanografia_interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Mecanografia_interfaz{

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

        System.out.println(pangramaActual);
        System.out.print("Escribe el siguiente pangrama:");

        while (true) {
            String entradaUsuario = scanner.nextLine();

            if (entradaUsuario.equals(pangramaActual)) {
                System.out.println("Correcto!");
                pulsacionesCorrectas += entradaUsuario.length();
                pangramaActual = pangramas.get(random.nextInt(pangramas.size()));
                System.out.println("Siguiente pangrama:");
                System.out.println(pangramaActual);
            } else {
                System.out.println("Incorrecto. Intenta de nuevo.");
                pulsacionesIncorrectas += entradaUsuario.length();
                for (char c : entradaUsuario.toCharArray()) {
                    if (!teclasDificiles.contains(c)) {
                        teclasDificiles.add(c);
                    }
                }
            }

            // Mostrar estadísticas después de cada intento
            System.out.println("Pulsaciones correctas: " + pulsacionesCorrectas);
            System.out.println("Pulsaciones incorrectas: " + pulsacionesIncorrectas);
            System.out.println("Teclas difíciles: " + teclasDificiles);
        }
    }

    private static List<String> cargarPangramas(String archivo) {
        List<String> pangramas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                pangramas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.shuffle(pangramas);
        return pangramas;
    }
    
}
