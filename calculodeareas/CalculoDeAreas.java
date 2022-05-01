
package calculodeareas;

import java.util.Scanner;
public class CalculoDeAreas {
static Scanner scanner=new Scanner (System.in);
   
    public static void main(String[] args) {
    
    //CIRCULO
    System.out.print("\n 1. Circulo ");
    System.out.print("\n Escoja la operacion que desea: ");
    
    int opcion = scanner.nextInt(); 
    switch(opcion){
    case 1 -> {  
    System.out.print("\n 1. Area de un Circulo ");
    System.out.print("\n 2. Perimetro de un Circulo ");
    System.out.print("\n 3. Volumen de un Circulo");
    System.out.print("\n 4. Area Sombreada de un Circulo ");
    System.out.print("\n Escoja la operacion que desea: ");
    
    int opcion1 = scanner.nextInt();    
        
      FuncionesComunes Comunes= new FuncionesComunes();
      switch(opcion1){
               
         case 1 -> {   
        System.out.print("Area de un Circulo\n"); 
        System.out.println("Ingrese un numero");
        int area=0;
        System.out.println("El resultado es: " + Comunes.AreadeunCirculo(area));
         }
        
        case 2 -> {                                               
        System.out.print("Perimetro de un Circulo\n");   
        int perimetro=0;
        System.out.println("El resultado es: " + Comunes.PerimetrodeunCirculo(perimetro)); 
         }
      
        case 3 -> { 
        System.out.print("Volumen de un Circulo\n");   
        System.out.print("Ingrese una altura\n");   
        int volumen1=0;
        System.out.println("El resultado es: " + Comunes.VolumendeunCirculo(volumen1));
         }
 
        case 4 -> { 
        double Resultado=0;
        System.out.println("El resultado es: " + Comunes.AreaSombreadadeunCirculo(Resultado));
         }
      
      }
       
 
    }

    }
    }
}