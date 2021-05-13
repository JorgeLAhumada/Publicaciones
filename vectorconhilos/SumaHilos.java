package vectorconhilos;

public class SumaHilos extends Thread {
    
    private int vect[];
    private int total;
    
    public SumaHilos(int vec[]){
        this.vect=vec;
    }
   
    @Override
        public void run(){
            for(int j=0; j<vect.length; j++){
                total +=vect[j]; 
                
            }
}

    public int getTotal(){
                return this.total;
            }
}
