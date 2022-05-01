
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

public double MedidadeunArcodeunCirculo (double sombreada){
     
       
     double Angulo5=50;  
     double Perimetro5=scanner.nextDouble();;
     double Regla1 = (2*Math.PI*Perimetro5);
     double resultado4 = (Regla1*Angulo5/360);
     return resultado4;
    }

public double AreaSombreadadeunTriangulo (double sombreada){
     
     
     System.out.print("Ingrese un Radio\n");   
     double Radio2=scanner.nextDouble();
     System.out.print("Ingrese un lado\n");   
     double Lado2=scanner.nextDouble();
     double AreaSombreada2 = (Lado2*Lado2);
     double AreadelCirculo2 = (Radio2*Radio2*Math.PI);
     double Resultado2 = (AreaSombreada2-AreadelCirculo2);
     return Resultado2;
    }

public int AngulodeunTriangulo (int sombreada){
     
     
     System.out.print("Angulo 1 = 55\n");   
     int Angulo1= 55; 
     System.out.print("Angulo 2 = 50\n");   
     int Angulo2= 50;
     System.out.print("Angulo 3 = 75\n");   
     int Angulo3= 75;
     int B2 = (Angulo1+Angulo2+Angulo3);
     return B2;
    }

public double MedidadeunArcodeunTriangulo (double sombreada){
     
     
     double Angulo6=90;  
     double Perimetro6=scanner.nextDouble();;
     double Regla2 = (2*Math.PI*Perimetro6);
     double resultado5 = (Regla2*Angulo6/180);
     return resultado5;
    }
}