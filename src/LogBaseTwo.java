public class LogBaseTwo {

    public static int nlog2(int n) {
        return n * log2(n);
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println("Log " + N + " to the base 2 = " + log2(N));
        System.out.println("Log " + N + " to the base 2 = " + N * log2(N));
    }
}
