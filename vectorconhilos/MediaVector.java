/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorconhilos;

public class MediaVector extends Thread {
    
     private int vect[];
     private double total;
    
    public MediaVector(int vec[]){
        this.vect=vec;
    }
   int sum=0;
    @Override
        public void run(){
            
            for(int j=0; j<vect.length; j++){
                sum+=vect[j]; 
                
            }
            total = (double)sum/vect.length;
}

    public double getTotal(){
                return this.total;
            }
    
}
