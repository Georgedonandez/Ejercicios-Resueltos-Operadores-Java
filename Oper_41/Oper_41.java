// Dada la ecuación 3w^2 + 24w - 33 = 0, determinar w

/* Dada una ecuación de segundo grado de la forma ax^2 + bx + c = 0, 
las dos raices x1,x2 de la ecuación se pueden obtener mediante las siguientes
fórmulas:
x1 = (-b/2a) + sqrt(b^2 - 4ac)/2a
x2 = (-b/2a) - sqrt(b^2 - 4ac)/2a
El discriminante k = (b^2 - 4ac) de la ecuación indica la naturaleza de las raices asi:
1. Si k > 0, entonces raices reales y diferentes
2. Si k = 0, entonces raices reales e iguales
3. Si k < 0, entonces raices complejas
 */ 
public class Oper_41 {
    public static void main(String[] args) {
        double a = 3;
        double b = 24;
        double c = -33;

        double w1real; //Parte real de la primera raiz
        double w1img; //Parte imaginaria de la primera raiz
        double w2real; //Parte real de la segunda raíz
        double w2img; //Parte imaginaria de la segunda raíz

        double k = Math.pow(b, 2) - 4*a*c; // Discriminante
        double kabs = Math.abs(k); // Valor absoluto del discriminante

        if (k > 0) {
            w1real = -b/(2*a) + Math.sqrt(kabs)/(2*a);
            w1img = 0;
            w2real = -b/(2*a) - Math.sqrt(kabs)/(2*a);
            w2img = 0;            
        }else if (k == 0){
            w1real = -b/(2*a);
            w1img = 0;
            w2real = -b/(2*a);
            w2img = 0;  
        } else {
            w1real = -b/(2*a);
            w1img = Math.sqrt(kabs)/(2*a); 
            w2real = -b/(2*a);
            w2img = -Math.sqrt(kabs)/(2*a);            
        }

        double w1iabs = Math.abs(w1img); //Valor absoluto de w1img
        double w2iabs = Math.abs(w2img); //Valor absoluto de w2img
        
        if (w1img >= 0) {
            System.out.println("w1 = "+w1real+" + j"+(w1iabs));
        } else {
            System.out.println("w1 = "+w1real+" - j"+(w1iabs));
        }        
        if (w2img >= 0) {
            System.out.println("w2 = "+w2real+" + j"+(w2iabs));
        } else {
            System.out.println("w2 = "+w2real+" - j"+(w2iabs));
        }                
    }     
}
