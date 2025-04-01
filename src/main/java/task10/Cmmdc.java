package task10;

public class Cmmdc {
    public static void main(String[] args) {
        int a = 14, b = 6;

        System.out.println("CMMDC cu scaderi repetate(" + a + ", " + b + ") = " + cmmdcScaderi(a, b));
        System.out.println("CMMDC cu impartiri repetate(" + a + ", " + b + ") = " + cmmdcImpartiri(a, b));
    }

    private static int cmmdcImpartiri(int a, int b) {
        while(b != 0) {
            int rest = a % b;  //56 % 98 => cat 0, rest 98 - 56 = 42
            a = b;
            b = rest;

            System.out.println("a = " + a + ", b = " + b, ", rest = " + rest);
        }
        return a;
    }
    /*
        Dpdv matematic, o sa existe o variabila d oarecare, care divide perfect atat a, cat si b
        d|a, d|b => cmmdc(a, b) = d, a>=b
     */



    private static int cmmdcScaderi(int a, int b) {
        while(a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a + ", b = " + b);
            } else {
                b = b - a;
                System.out.println("a = " + a + ", b = " + b);
            }
        }
        return 0;
    }
}
