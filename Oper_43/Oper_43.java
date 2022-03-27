/* Determinar la magnitud de la impedancia en ohms y el 
àngulo de fase en grados de un circuito RL serie formado 
por una resistencia de 600 ohm y una reactancia de 800 ohms */

/* En un circuito serie, la impedancia es Z = R + jX, siendo R
la resistencia y X la rectancia. Si X es inductiva lleva el signa
+ y si es capacitiva lleva el signo -. La magnitud de la impedancia
es sqrt(R^2+X^2) y el àngulo de fase es atan(X/R).
*/
public class Oper_43 {
    public static void main(String[] args) {
        double r = 600;
        double x = 800;

        double z = Math.sqrt(Math.pow(r, 2)+Math.pow(x, 2)); //Magnitud de la impedancia
        double thetar = Math.atan(x/r); //Angulo de la impedancia en radianes
        double thetag = Math.toDegrees(thetar); //Angulo de la impedancia en grados
        thetag = Math.abs(thetag ); //Valor absoluto del ángulo de la impedancia en grados

        if (x >= 0){
            System.out.println("Impedancia = "+z+" ohms; Angulo = "+thetag+" grados");
        }else {
            System.out.println("Impedancia = "+z+" ohms; Angulo = -"+thetag+" grados");
        }

    }    
}
