
package calculodeareas;

import static calculodeareas.CalculoDeAreas.scanner;

public class FuncionesComunes extends FuncionesEspecificas {
    //AREA
    public double AreadeunCirculo(double radio){
      double radioo=scanner.nextDouble();
      double area = (2*Math.PI*radioo);
      return area;
    }
   
     
}