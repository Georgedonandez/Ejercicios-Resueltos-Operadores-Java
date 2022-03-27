// Sumar 2+j6 a 5-j8 e imprimir el resultado
public class Oper_37 {
    public static void main(String[] args) {
        double xreal = 2;
        double ximg = 6;
        double yreal = 5;
        double yimg = -8;        

        double zreal = xreal + yreal; //Parte real de la suma
        double zimg = ximg + yimg;  //Parte imaginario de la suma 
        double ziabs = Math.abs(zimg); //Valor absoluto de zimg

        if (zimg >= 0) {
            System.out.printf(zreal+" + j"+(ziabs));
        } else {
            System.out.printf(zreal+" - j"+(ziabs));
        }

      
    }
}
