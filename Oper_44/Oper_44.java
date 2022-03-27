/* Determinar la resistencia en ohms y el àngulo de fase 
en grados de un circuito RC serie cuya impédancia es de
1300 ohm y cuya reactancia es de 1200 ohms */

/* En un circuito serie, la impedancia es Z = R + jX, siendo R
la resistencia y X la rectancia. Si X es inductiva lleva el signa
+ y si es capacitiva lleva el signo -. La magnitud de la impedancia
es sqrt(R^2+X^2) y el àngulo de fase es atan(X/R).
*/
public class Oper_44 {
    public static void main(String[] args) {
        double z = 1300;
        double x = -1200;

        double r = Math.sqrt(Math.pow(z, 2)-Math.pow(x, 2)); //Magnitud de la resistencia
        double thetar = Math.atan(x/r); //Angulo de la impedancia en radianes
        double thetag = Math.toDegrees(thetar); //Angulo de la impedancia en grados
        thetag = Math.abs(thetag ); //Valor absoluto del ángulo d ela impedancia en grados

        if (x >= 0){
            System.out.println("Resistencia = "+r+" ohms; Angulo = "+thetag+" grados");
        }else {
            System.out.println("Resistencia = "+r+" ohms; Angulo = -"+thetag+" grados");
        }
    }    
}


