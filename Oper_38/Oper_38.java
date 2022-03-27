// De -1 + j8 restar 3 - j6 e imprimir el resultado
public class Oper_38 {
    public static void main(String[] args) {
        double xreal = -1;
        double ximg = 8;
        double yreal = 3;
        double yimg = -6;        

        double zreal = xreal - yreal; //Parte real de la suma
        double zimg = ximg - yimg;  //Parte imaginario de la suma 
        double ziabs = Math.abs(zimg); //Valor absoluto de zimg

        if (zimg >= 0) {
            System.out.printf(zreal+" + j"+(ziabs));
        } else {
            System.out.printf(zreal+" - j"+(ziabs));
        }
    }
}    