package publicacion; 

public class Periodico extends Publicacion implements Periodicidad {

   private String secciones;
   private String editor; 
   
   public String getSecciones(){
      return secciones;
   } 
   
   public void setSecciones(String sec){
      secciones = sec;
   }
      
   public String getEditor(){
      return editor;
   }
   
   public void setEditor(String ed){
      editor = ed;
   }
   
   @Override
   public String getPeriodicidad()//implementaci�n del m�todo periodicidad
    {
     return periodicidad;
    } 
}