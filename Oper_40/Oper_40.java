// Determinar la inversa de  7 - j2 e imprimir el resultado

/* Dado un numero complejo X=a+jb, la inversa Q=1/X=c+jd se determina
dividiendo el conjugado de X, que es a-jb, entre el producto de X por su conjugado.
Este producto es siempre un número real igual a (a^2 + b^2)
*/
public class Oper_40 {
    public static void main(String[] args) {    
        double xreal = 7; //Parte real del número
        double ximg = -2; //Parte imaginaria del número

        double qreal; //Parte real de la inversa (definida solamente)
        double qimg; //Parte imaginaria de la inversa (definida solamente)  

        double xconjr = xreal; //Parte real del conjugado
        double xconji = -(ximg); //Parte imaginaria del conjugado
       
        double qnumer = xconjr; //Parte real del numerador de la inversa
        double qnumei = xconji; //parte imaginaria del numerador de la inversa

        double qdenor = Math.pow(xreal, 2) + Math.pow(ximg, 2); //Parte real del denominador de ña inversa
        //double qdenoi = 0; //Parte imaginaria del denominador de la inversa

        qreal = qnumer/qdenor;  //Parte real de la inversa
        qimg = qnumei/qdenor;   //Parte imaginaria de la inversa 
 
        double qiabs = Math.abs(qimg); //Valor absoluto de qimg 

        if (qimg >= 0) {
            System.out.printf(qreal+" + j"+(qiabs));
        } else {
            System.out.printf(qreal+" - j"+(qiabs));
        }
    }
}

