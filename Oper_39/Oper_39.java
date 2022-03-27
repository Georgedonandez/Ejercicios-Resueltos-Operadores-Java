// Multiplicar 7 - j2 por -4 + j14 e imprimir el resultado
public class Oper_39 {
    public static void main(String[] args) {
        double xreal = 7;
        double ximg = -2;
        double yreal = -4;
        double yimg = 14;        

        double zreal = (xreal*yreal) - (ximg*yimg); //Parte real
        double zimg = (xreal*yimg) + (ximg*yreal);  //Parte imaginaria 
        double ziabs = Math.abs(zimg); //Valor absoluto de zimg

        if (zimg >= 0) {
            System.out.printf(zreal+" + j"+(ziabs));
        } else {
            System.out.printf(zreal+" - j"+(ziabs));
        }
    }
}
