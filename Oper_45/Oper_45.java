/* Determine la admitancia en milisiemens de un circuito 
RL serie cuya impedancia entre terminales es 50 + j50 ohms
*/

/* En un circuito paralelo, la admitancia Y, medida en Siemens (S)
es Y = G +- jB, siendo G la conductancia y B la susceptancia. Si 
B es inductiva lleva el signo - y si es capacitiva lleva el
signo +. La admitancia Y y la impedancia Z son valores recíprocos,
uno del otro, es decir Z=1/Y y Y=1/Z
*/
public class Oper_45 {
    public static void main(String[] args) {
        double r = 50;
        double x = 50;

        double g; //Valor de la conductancia (declaración)
        double b; //Valor de la susceptancia (declaración)

        double rk = r;//parte real del conjugado de la impedancia
        double xk = -x;//parte imaginaria del conjugado de la impedancia

        double ynumer = rk; //Parte real del numerador de la admitancia
        double ynumei = xk; //Parte imaginaria del numerador de la admitancia

        double ydenor = Math.pow(r, 2) + Math.pow(x, 2); //Parte real del denominador de la admitancia
        //double ydenoi = 0; //Parte imaginaria del denominador de la admitancia       

        g = 1000*(ynumer/ydenor);  //Valor de la conductancia (parte real de y) en milisiemens
        b = 1000* (ynumei/ydenor);   //Valor de la susceptancia parte imaginaria de y)  en milisiemens  
        
        double babs = Math.abs(b); //Valor absoluto de la suceptancia en milisiemens

        if (b >= 0) {
            System.out.printf("Admitancia = "+g+" + j"+babs+" mS");
        } else {
            System.out.printf("Admitancia = "+g+" - j"+babs+" mS");
        }        
    }   
}


/* Determinar la resistencia en ohms y el àngulo de fase 
en grados de un circuito RC serie cuya impédancia es de
1300 ohm y cuya reactancia es de 1200 ohms
 En un circuito serie, la impedancia es Z = R + jX, siendo R
la resistencia y X la rectancia. Si X es inductiva lleva el signa
+ y si es capacitiva lleva el signo -. La magnitud de la impedancia
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
*/