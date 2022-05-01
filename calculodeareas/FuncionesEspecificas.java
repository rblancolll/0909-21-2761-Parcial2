
package calculodeareas;

import static calculodeareas.CalculoDeAreas.scanner;


public class FuncionesEspecificas {
public double AreaSombreadadeunCirculo (double sombreada){
     
     System.out.print("Ingrese un Radio\n");   
     double Radio=scanner.nextDouble();
     System.out.print("Ingrese un lado\n");   
     double Lado=scanner.nextDouble();
     double AreaSombreada = (Lado*Lado);
     double AreadelCirculo = (Radio*Radio*Math.PI);
     double Resultado = (AreaSombreada-AreadelCirculo);
     return Resultado;
    }

public int AngulodeunCirculo (int sombreada){
     
     int Angulo=scanner.nextInt();
     int B = (Angulo/2);
     return B;
    }

}