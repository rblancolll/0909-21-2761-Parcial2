
package calculodeareas;

import java.util.Scanner;
public class CalculoDeAreas {
static Scanner scanner=new Scanner (System.in);
   
    public static void main(String[] args) {
    
    //CIRCULO
    System.out.print("\n 1. Circulo ");
    System.out.print("\n 2. Triangulo ");
    System.out.print("\n 3. Rectangulo ");
    System.out.print("\n Escoja la operacion que desea: ");
    
    int opcion = scanner.nextInt(); 
    switch(opcion){
    case 1 -> {  
    System.out.print("\n 1. Area de un Circulo ");
    System.out.print("\n 2. Perimetro de un Circulo ");
    System.out.print("\n 3. Volumen de un Circulo");
    System.out.print("\n 4. Area Sombreada de un Circulo ");
    System.out.print("\n 5. Angulo de un Circulo ");
    System.out.print("\n 6. Medida de un arco de un Circulo");
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
      
        case 5 -> { 
        System.out.print("Ingrese un Angulo\n");   
        int B=0;
        System.out.println("El resultado es: " + Comunes.AngulodeunCirculo(B));
         }
      
        case 6 -> { 
        System.out.print("Angulo = 50\n");  
        System.out.print("Ingrese Perimetro\n");  
        int resultado4=0;
        System.out.println("El resultado es: " + Comunes.MedidadeunArcodeunCirculo(resultado4));
         }
      }
       
 
    }
       case 2 -> {  
       System.out.print("\n 1. Area de un Triangulo ");
       System.out.print("\n 2. Perimetro de un Triangulo ");
       System.out.print("\n 3. Volumen de un Triangulo");
       System.out.print("\n 4. Area Sombreada de un Triangulo ");
       System.out.print("\n 5. Angulo de un Triangulo ");
       System.out.print("\n 6. Medida de un arco de un Triangulo");
       System.out.print("\n Escoja la operacion que desea: ");
       int opcion2 = scanner.nextInt();    
       FuncionesComunes Comunes= new FuncionesComunes();
       switch(opcion2){
        case 1 -> { 
                                                             
        System.out.print("Ingrese la base:\n");  
        double area2= 0;
        System.out.println("EL resultado es: "+Comunes.AreadeunTriangulo(area2)); 
         }
       case 2 -> {
   
        double perimetro2= 0;
        System.out.println("EL resultado es: "+Comunes.PerimetrodeunTriangulo(perimetro2));       
         }
       
       case 3 -> { 
      
        double volumen2= 0;
        System.out.println("EL resultado es: "+Comunes.VolumendeunTriangulo(volumen2)); 
         }
       
       case 4 -> { 
                                                             
        double Resultado2= 0;
        System.out.println("EL resultado es: "+Comunes.AreaSombreadadeunTriangulo(Resultado2));  
         }
       
       case 5 -> {
   
        int B2 = 0;
        System.out.println("EL resultado es: "+Comunes.AngulodeunTriangulo(B2));         
         }
       
       case 6 -> { 
        System.out.print("Angulo = 90\n");  
        System.out.print("Ingrese Perimetro\n");
        int resultado5 = 0;
        System.out.println("EL resultado es: "+Comunes.MedidadeunArcodeunTriangulo(resultado5));    
         }
       
      }
    }

      case 3 -> {  
       System.out.print("\n 1. Area de un Rectangulo ");
       System.out.print("\n 2. Perimetro de un Rectangulo ");
       System.out.print("\n 3. Volumen de un Rectangulo");
       System.out.print("\n 4. Area Sombreada de un Rectangulo ");
       System.out.print("\n 5. Angulo de un Rectangulo ");
       System.out.print("\n 6. Medida de un arco de un Rectangulo");
       System.out.print("\n Escoja la operacion que desea: ");
       
       int opcion3 = scanner.nextInt();    
       FuncionesComunes Comunes= new FuncionesComunes();
       switch(opcion3){
        
        case 1 -> { 
        System.out.print("Ingrese la base:\n");  
        double area3= 0;
        System.out.println("El resultado es: " + Comunes.AreadeunRectangulo(area3));
         }
      
        case 2 -> {
        int perimetro3= 0;
        System.out.println("El resultado es: " + Comunes.PerimetrodeunRectangulo(perimetro3));      
         }
       
        case 3 -> { 
        int volumen3= 0;
        System.out.println("El resultado es: " + Comunes.VolumendeunRectangulo(volumen3));
         }
       
        case 4 -> {                                                 
        int Resultado3= 0;
        System.out.println("El resultado es: " + Comunes.AreaSombreadadeunRectangulo(Resultado3)); 
         }
        
        case 5 -> {
        int B3= 0;
        System.out.println("El resultado es: " + Comunes.AngulodeunRectangulo(B3));
         }
       
        case 6 -> { 
        
        System.out.print("Angulo = 60\n");  
        System.out.print("Ingrese Perimetro\n");
        int resultado6= 0;
        System.out.println("El resultado es: " + Comunes.MedidadeunArcodeunRectangulo(resultado6));
         }
        
       }
    }
 }
    
    }
}