/* Determine la corriente en miliameprios (mA) que atraviesa  un
conductor si se detecta en un punto dado que pasan 0.784x10^18 
electrones en 643 milisegundos (ms). La carga del electrón es igual a
-1.602x10^-19 coulombs (C)
*/

/* La corriente (I) se define como la rapidez de cambio de la
la carga (ΔQ) con respecto al tiempo (Δt), es decir I=ΔQ/Δt
*/
public class Oper_46 {
    public static void main(String[] args) {
        double n = 0.784E18; //numero de electrones 
        double e = -1.602E-19; //carga del electrón (C)
        double q = n*e; //carga equivalente en Coulombios (C)
        double t = 643E-3; //tiempo en segundos

        double i = q/t; //Corriente resultante (A)
        i = Math.abs(i)*1000; //Valor absoluto de la corriente en mA

        System.out.printf("Corriente = "+i+" mA"); 
        //System.out.printf("Numero de Electrones = "+n+" particulas");
        //System.out.printf("Carga del Electrón = "+e+" C"); 
        //System.out.printf("Carga Total = "+q+" C");  
        //System.out.printf("Tiempo Total = "+t+" s");         
    }
}
