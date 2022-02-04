/**
 para la creacion de la clase se crea el metodo de acceso que en este caso es publico
 luego la palabra class y luego el nombre del nombre de la clase
 */
public class Persona {
  
    //Atributos
     public String Name;
     public String lastName1;
     public String lastName2;
     public String datebirh;
     public float height;
    
     public static void main(String [] args){
   /**
    * crecion objetos
    */
       
       Persona persona1 =new Persona();
       
       persona1.Name = "Miguel";
       persona1.lastName1 = "Torres";
       persona1.lastName2 = "Diaz";
       persona1.datebirh = "22 de marzo 1992";
       persona1.height = 67;
       
     }
   
       public String getName() {
           return Name;
       }
   
       public void setName(String Name) {
           this.Name = Name;
       }
   }
   