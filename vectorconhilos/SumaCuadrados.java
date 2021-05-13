/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorconhilos;

public class SumaCuadrados extends Thread{
    
    private int vect[];
    private int total;
    
    public SumaCuadrados(int vec[]){
        this.vect=vec;
    }
   
    @Override
        public void run(){
            for(int j=0; j<vect.length; j++){
                total +=Math.pow(vect[j],2); 
                
            }
}

    public int getTotal(){
                return this.total;
            }
}
    

