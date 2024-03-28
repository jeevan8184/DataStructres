package AllGraphs;

public class Factorial {
    public static int calcFact(int n) {
        if (n == 1) {
            return 1;
        }

        int factnm1 = calcFact(n - 1);
        int fact = n * factnm1;
        return fact;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(calcFact(n));

    }
}