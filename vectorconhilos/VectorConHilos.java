/*
 * Implemente un programa en java que utilice hilos. El tamaño del vector es desde el main como
 * parametro. El llenado del vector es aleatorio. El Hilo muestra la suma de los elementos de un
 * vector, la suma de los cuadrados de los elementos del vector y la media. Cree dos instancias con
 * diferente tamaño de vector y precente los resultados
 */
package vectorconhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class VectorConHilos {


    public static void main(String[] args) {
        
        int m[] = new int[10];
        
        System.out.println("Numeros generados aleatoreamente: ");
        for(int i=0; i<m.length; i++){
                m[i]=(int)(Math.random()*9);
                System.out.println(m[i]);
            }
        
        SumaHilos h1 = new SumaHilos(m);
        SumaCuadrados h2 = new SumaCuadrados(m);
        MediaVector h3 = new MediaVector(m);
        h1.start();
        h2.start();
        h3.start();
       
        try {
            h1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(VectorConHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(VectorConHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            h3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(VectorConHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Suma total del vector es : "+h1.getTotal());
        System.out.println("La suma de los cuadrados del vector es : "+h2.getTotal());
        System.out.println("La media del vector es: "+h3.getTotal());
    }
    
}
