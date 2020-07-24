/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_simple;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/***
 * Clase principal.
 * @author Fernando García
 */
public class main {
    public static void main(String[] args) throws IOException{
        /**
         * Existencia del archivo:
         * Aqui verificaremos si el "archivo.txt", en la raíz del proyecto, existe...
         */
        File fichero = new File("archivo.txt");
        
        /**
         * Si el archivo existe entonces se accede a las siguientes funciones:
         */
        if(existencia(fichero) == true){
            Lectura lectura = new Lectura(fichero);
            /**********************
             * FUNCIÓN DE LECTURA *
             **********************/
            /**
             * Seleccionar el método de lectura:
             */
            //lectura.lectura();
            ArrayList<String> lineas = lectura.lectura(true);
            System.out.println("Número de líneas: " + lineas.size());
            
            /************************
             * FUNCIÓN DE ESCRITURA *
             ************************/
            String a_escribir = "Mensaje a escribir 1";
            Escritura escritura = new Escritura();
            escritura.escritura(fichero, a_escribir);
            /**
             * Sugerencia: El método lee una sola línea, se puede implementar un ciclo para escribir
             * varias líneas, por ejemplo ->
             */
            
            String[] mensajes = {"Mensaje 1.1","Mensaje 1.2","Otro mensaje"};
            for(int i = 0; i < mensajes.length; i++){
                escritura.escritura(fichero, mensajes[i]);
            }
            /**
             * Podemos notar que el fichero no cambia y se va recorriendo el arreglo para añadir
             * las líneas que se contienen en el mismo
             */
        }else{
            System.out.println("El archivo especificado no existe");
        }
    }
    
    public static boolean existencia(File fichero){
        if(fichero.exists() == true){
            return true;
        }else{
            return false;
        }
    }
}
