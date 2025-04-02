package task10;

// todo: cmmmd, base 10 -> base 2

public class Cmmdc {

    public static void main(String[] args) {
        int a = 56, b = 98;

        System.out.println("CMMDC cu scaderi repetate intre " + a + " si " + b + " este " + cmmdcScaderi(a, b) + "\n");
        System.out.println("CMMDC cu resturi repetate intre " + a + " si " + b + " este " + cmmdcImpartiri(a, b));
    }

    private static int cmmdcImpartiri(int a, int b) {
        while (b != 0) {
            int rest = a % b;   // 56 % 98 = cat 0, rest 56
            a = b;  // a = 56
            b = rest; // b = 42

            System.out.println("a = " + a + ", b = " + b + ", rest = " + rest);
        }

        return a;
    }

    /*
        Dpdv matematic, o sa existe o variabila d oarecare, care divide perfect atat a, cat si b.
        d | a, d | b => cmmdc(a,b) = d, a >= b
     */
    private static int cmmdcScaderi(int a, int b) {
        // 14 6
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a + ", b = " + b);
            } else {
                b = b - a;
                System.out.println("a = " + a + ", b = " + b);
            }
        }

        return a;
    }
}