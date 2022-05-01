
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
 
}