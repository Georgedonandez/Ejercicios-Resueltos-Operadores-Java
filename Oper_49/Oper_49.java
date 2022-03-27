/* Determinar la conductividad y la conductancia de un lingote
de oro de forma cuadrada, de 5 cm de lado 0.75 m de longitud.
La resistividdad del oro a 20°C es 2.4x10^-8 Ω-m
*/

/* La conductancia (G) y la conductividad (σ) son, respectivamente,
el recípro de la resistencia (1/R) y de la resistividad (1/ρ). De 
este modo, G=σA/l, siendo A el area de corte transversal y l la
longitud. La unidad SI de G es el siemen (S) y de σ el siemens/metro (S/m
*/
public class Oper_49 {
    public static void main(String[] args) {
        double g; //Conductancia del material (S)
        double a; //Area de la sección transversal (m^2)
        double sigma; //Conductivividad del material (S/m)
        double rho = 2.4E-8;//Resistividad del material (Ω-m)
        double b = 5E-2;//Lado de la sección transvrsal (m)
        double l = 0.75; //Longitud del material (m)

        a = b*b; //Area de la sección transversal (m^2)
        sigma = 1/rho; //Conductivividad del material (S/m)
        g = sigma*a/l; //Conductancia del material (S)

        System.out.println("Conductancia = "+g+" S");  
        System.out.println("Conductividad = "+sigma+" S/m"); 
    }
}
