//Las publicaciones se guardan en un arreglo de tamaño 10
package publicacion;
import java.util.*;
public class Principal {

   public static void main(String[] args) {
      int ctrlpub = 0;
      int opc = 0, opc2 = 0;
      int pag = 0,precio = 0,num = 0,year = 0;
      String ISBN,edicion,autor,titulo,ISSN,secciones,editor;
         
      Scanner leer = new Scanner(System.in);
      Object publicaciones [] = new Object[10]; 
        
      do{
         System.out.println("Menu");
         System.out.println("[1]...Agregar");
         System.out.println("[2]...Mostrar");
         System.out.println("[3]...Salir");
         System.out.print("Seleccione una opcion: ");
         opc = leer.nextInt();
        
         switch(opc){
            case 1:
            
               System.out.println("Que desea agregar?");
               System.out.println("[1]...Libro");
               System.out.println("[2]...Revista");
               System.out.println("[3]...Periodico");
               System.out.print("seleccione una opcion: ");
               opc2 = leer.nextInt();
               leer.nextLine();
               
               switch(opc2){
                  case 1:
                     Libro libro = new Libro();
                     System.out.println("---Libro---");
                     System.out.println("ingrese los siguientes datos: ");
                     
                     System.out.print("ISBN: ");
                     ISBN = leer.nextLine();
                     
                     System.out.print("Titulo: ");
                     titulo = leer.nextLine();
                     
                     System.out.print("Edicion: ");
                     edicion = leer.nextLine();
                     
                     System.out.print("Autor: ");
                     autor = leer.nextLine();
                     
                     System.out.print("Numero de paginas: ");
                     pag = leer.nextInt();
                     leer.nextLine();
                     System.out.print("precio: $");
                     precio = leer.nextInt();
                     leer.nextLine();
                     
                     libro.setISBN(ISBN);
                     libro.setTitulo(titulo);
                     libro.setAutor(autor);
                     libro.setEdicion(edicion);
                     libro.setPrecio(precio);
                     libro.setNumpag(pag);
                     publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                     ctrlpub++;
                     
                     break;
                     
                  case 2:
                     Revista revista = new Revista();
                     System.out.println("---Revista---");
                     System.out.print("ISSN: ");
                     ISSN = leer.nextLine();
                     
                     System.out.print("Titulo: ");
                     titulo = leer.nextLine();
                     
                     System.out.print("Precio: $");
                     precio = leer.nextInt();
                     leer.nextLine();
                     
                     System.out.print("Numero: ");
                     num = leer.nextInt();
                     leer.nextLine();
                     
                     System.out.print("Año: ");
                     year = leer.nextInt();
                     leer.nextLine();
                     
                     System.out.print("Numero de paginas: ");
                     pag = leer.nextInt();
                     leer.nextLine();
                     
                     revista.setISSN(ISSN);
                     revista.setTitulo(titulo);
                     revista.setPrecio(precio);
                     revista.setNumero(num);
                     revista.setAnio(year);
                     revista.setNumpag(pag);
                   
                     publicaciones[ctrlpub] = revista;
                     ctrlpub++;
                  
                     break;
                     
                  case 3:
                     Periodico periodico = new Periodico();
                     System.out.println("---Periodico---");
                     System.out.print("Editor: ");
                     editor = leer.nextLine();
                     
                     System.out.print("Secciones: ");
                     secciones = leer.nextLine();
                     
                     System.out.print("Titulo: ");
                     titulo = leer.nextLine();
                     
                     System.out.print("Numero de paginas: ");
                     pag = leer.nextInt();
                     leer.nextLine();
                     
                     System.out.print("Precio $: ");
                     precio = leer.nextInt();
                     leer.nextLine();
                     
                     periodico.setSecciones(secciones);
                     periodico.setEditor(editor);
                     periodico.setTitulo(titulo);
                     periodico.setPrecio(precio);
                     periodico.setNumpag(pag);
                     
                     publicaciones[ctrlpub] = periodico;
                     ctrlpub++;
                     
                     break;
               }
            
               break;
         
            case 2:
               for(int a = 0; a<ctrlpub; a++ ) {
                  System.out.println("  " + publicaciones [a].getClass()); //obtiene la clase 
                 
                  if(publicaciones[a] instanceof Libro){
                     
                     Libro lib = new Libro();
                     lib = (Libro)publicaciones[a];
                     
                     System.out.println("---Libro---");
                     System.out.println("ISBN: "+lib.getISBN());
                     System.out.println("Edicion: "+ lib.getEdicion());
                     System.out.println("Autor: "+ lib.getAutor());
                     System.out.println("Titulo: "+ lib.getTitulo());
                     System.out.println("Numero de paginas: "+lib.getNumpag());
                     System.out.println("Precio : $"+lib.getPrecio());
                     System.out.println("\n");
                     
                  }
                  else 
                     if(publicaciones[a] instanceof Revista){
                     
                        Revista rev = new Revista();
                        rev = (Revista)publicaciones[a];
                        
                        System.out.println("---Revista---");
                        System.out.println("ISSN: "+rev.getISSN());
                        System.out.println("Numero: "+rev.getNumero());
                        System.out.println("Año: "+rev.getAnio());
                        System.out.println("Titulo: "+rev.getTitulo());
                        System.out.println("Numero de paginas: "+rev.getNumpag());
                        System.out.println("Precio: $"+rev.getPrecio());
                        System.out.println("\n");
                     
                     }
                     else 
                        if(publicaciones[a] instanceof Periodico){
                           
                           Periodico per = new Periodico();
                           per = (Periodico)publicaciones[a];
                           
                           System.out.println("---Periodico---");
                           System.out.println("Editor: "+per.getEditor());
                           System.out.println("Secciones: "+per.getSecciones());
                           System.out.println("Titulo: "+per.getTitulo());
                           System.out.println("Numero de paginas: "+per.getNumpag());
                           System.out.println("Precio: $"+per.getPrecio());
                           System.out.println("\n");
                        }
               
               }
            
               break;
         
            case 3:
               System.out.println("Fin del programa,buen dia");
               break;
         
            default:
               System.out.println("opcion no valida,intente otra vez");
         }
        
      }while(opc!=3);
   }
}