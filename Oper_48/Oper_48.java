/*Determinar la resistencia a 20°C de una placa de germanio 
intrinseco que tien una longitud de 0.5 m y una sección transversal
trapezoidal de 0.2 cm de altura y lados paralelos de 0.3 cm 
y 0.7 cm, respectivamente. La resistividad del germanio a 20°C es
de 0.45 Ω-m
*/

/*La resistencia eléctrica (R) de un material a una tempertaura
constante está dada por R = ρl/A, siendo ρ la resistividad a esa
temperatura, l la longitud y A el area de corte transversal

*/
public class Oper_48 {
    public static void main(String[] args) {
        double r; //Resistencia del material (Ω)
        double a; //Area de la sección transverdsal (m^2)
        double rho = 0.45; //Resistividad del material (Ω-m)
        double l = 0.5; //Longitud del material (m)
        double h = 0.2E-2; //Altura de la sección transversal (m)
        double b1 = 0.3E-2; //lado menor de la sección transversal (m)
        double b2 = 0.7E-2; //lado mayor de la sección transversal (m)

        a = 0.5*h*(b1 + b2); //Area de la sección transverdsal (m^2)
        r = (rho*l)/a; //Resistencia del material (Ω) 
        
        System.out.printf("Resistencia = "+r+" ohms");         

        
    }   
}
