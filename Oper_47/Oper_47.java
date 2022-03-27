/*Determinar la cantidad de trabajo en joules (J) necesaria para 
para desplzar 4 microcoulombios (μC) de carga entre dos puntos 
entre los cuales existe una diferencia de potencial de 36 voltios (V)
*/

/* El voltaje o diferencia de potencial (V) se define como V=ΔW/ΔQ, es
decir el trabajo por unidad de carga (ΔW/ΔQ) ejercido por un campo 
eléctrico para mover una carga de un punto a otro. 
*/
public class Oper_47 {
    public static void main(String[] args) {
        double q = 4E-6; //Cantidad de carga a mover (C)
        double v = 36; //Voltaje o diferencia de potencial existente
        double w = q*v; //Cantidad de energia o trabajo necesari@ (J)

        System.out.printf("Trabajo = "+w+" J");

    }   
}
