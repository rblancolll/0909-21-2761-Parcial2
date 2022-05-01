
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
}