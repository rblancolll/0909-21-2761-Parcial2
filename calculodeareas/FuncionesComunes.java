
package calculodeareas;

import static calculodeareas.CalculoDeAreas.scanner;

public class FuncionesComunes extends FuncionesEspecificas {
    //AREA
    public double AreadeunCirculo(double radio){
      
      double radioo=scanner.nextDouble();
      double area = (2*Math.PI*radioo);
      return area;
    }
   
 public double PerimetrodeunCirculo (double circulo){
     
     
     double radio2=scanner.nextDouble();
     double perimetro = (Math.PI*radio2);
     return perimetro;
    }
 
 public double VolumendeunCirculo (double volumen){
     
     double r=scanner.nextDouble();
     int num1=4;
     int num2=3;
     double volumen1= Math.PI*num1/num2*r*r*r;
     return volumen1;
    } 


public double AreadeunTriangulo (double triangulo){
   
                                                           
    double base=scanner.nextDouble();
    System.out.print("Ingrese la altura:\n");                                                         
    double altura=scanner.nextDouble();
    double area2 = (base*altura)/2;
    return area2;       
   }

public double PerimetrodeunTriangulo (double triangulo2){
     
     System.out.print("Lado 1\n");   
     double lado1=scanner.nextDouble();
     System.out.print("Lado 2\n");   
     double lado2=scanner.nextDouble();
     System.out.print("Lado 3\n");   
     double lado3=scanner.nextDouble();
     double perimetro2 = (lado1+lado2+lado3);
     return perimetro2;

  }

public double VolumendeunTriangulo (double volumen){
     
     
     System.out.print("Ingrese una altura\n");   
     double ab=scanner.nextDouble();
     System.out.print("Ingrese una base\n");   
     double h=scanner.nextDouble();
    System.out.print("Ingrese la altura del cuerpo\n");   
     double hc=scanner.nextDouble();
     double volumen2= (ab*h)/2*hc;
     return volumen2; 

}

 public double AreadeunRectangulo (double rectangulo){
   
                                                           
    double base=scanner.nextDouble();
    System.out.print("Ingrese la altura:\n");                                                         
    double altura=scanner.nextDouble();
    double area3 = (base*altura);
    return area3;      

   }


}