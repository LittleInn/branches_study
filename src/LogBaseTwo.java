public class LogBaseTwo {

    public static int nlog2(int n) {
		System.out.println("Calculate Log ");
		int result = n * log2(n);
        return result;
    }

    public static void main(String[] args) {
        int N = 4;
		if(N>10){
		System.out.println(" Log > 10");
		}else{
		System.out.println(" Log < 10");
		}
        System.out.println("Log " + N + " to the base 2 = " + log2(N));
        System.out.println("Log " + N + " to the base 2 = " + N * log2(N));
        System.out.println("Log " + 5 + " to the base 2 = " + 5 * log2(5));
    }
}
