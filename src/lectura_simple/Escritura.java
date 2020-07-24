/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_simple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fernando García
 */
public class Escritura {

    /**
     * Constructor vacío de la clase.
     */
    public Escritura() {

    }

    /**
     * Se envía el archivo a leer y la línea a escribir
     *
     * @param archivo
     * @param linea
     */
    public void escritura(File archivo, String linea) throws IOException {
        System.out.println("\nEscritura ->");
        BufferedWriter buffer_writer = null;
        FileWriter file_writer = null;
        try {
            String data = linea;
            File file = archivo;
            
            /**
             * El argumento "true", indica adjuntar información al archivo,
             * sin sobreescribir lo que ya está ahí.
             */
            file_writer = new FileWriter(file.getAbsoluteFile(), true);
            buffer_writer = new BufferedWriter(file_writer);
            buffer_writer.write("\n" + data);       // Escritura del archivo
            
            //Debug info: eliminar línea
            System.out.println("Linea agregada");
        } catch (IOException ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (buffer_writer != null) {
                    buffer_writer.close();
                }
                if (file_writer != null) {
                    file_writer.close();
                }
            } catch (IOException ex) {
                System.out.println("Mensaje de error: " + ex.getMessage());
            }
        }
    }
}
