/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_simple;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase de lectura de archivo.
 *
 * @author Fernando García
 */
public class Lectura {

    File file;
    ArrayList<String> lineas = new ArrayList<>();

    /**
     * Se envía el archivo para la lectura del mismo, antes se debe verificar
     * que en la clase principal exista el archivo.
     *
     * @param archivo
     */
    public Lectura(File archivo) {
        this.file = archivo;
    }

    /**
     * Método de lectura sin argumentos, retorna todas las líneas leídas en una
     * lista a la cual se puede acceder en el ciclo de lectura.
     *
     * @return
     */
    public ArrayList<String> lectura() {
        // Se inicia el objeto para escanear el documento
        Scanner scanner = null;

        // Leemos el archivo
        try {
            scanner = new Scanner(this.file);
            /**
             * Ciclo donde se muestra en consola cada línea y se agrega a la
             * lista
             */
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);      //se muestra en consola
                lineas.add(linea);              //se añade al arreglo
            }
            /**
             * Manejo de excepciones.
             */
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception ex) {
                System.out.println("Mensaje de error: " + ex.getMessage());
            }
        }
        return lineas;
    }
    
    /**
     * Método de lectura con un argumento, retorna todas las líneas leídas en una
     * lista a la cual se puede acceder en el ciclo de lectura, se añade la variable
     * "show" -> False no muestra las líneas en consola, True las muestra
     *
     * @return
     */
    public ArrayList<String> lectura(boolean show) {
        System.out.println("\nLectura ->");
        // Se inicia el objeto para escanear el documento
        Scanner scanner = null;

        // Leemos el archivo
        try {
            scanner = new Scanner(this.file);
            /**
             * Ciclo donde se muestra en consola cada línea y se agrega a la
             * lista
             */
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if(show == true){
                    System.out.println(linea);      //se muestra en consola
                    lineas.add(linea);              //se añade al arreglo
                }else{
                    lineas.add(linea);              //se añade al arreglo
                }
            }
            /**
             * Manejo de excepciones.
             */
        } catch (Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception ex) {
                System.out.println("Mensaje de error: " + ex.getMessage());
            }
        }
        return lineas;
    }
}
