public class FibonacciSeries {
    public static void main (String[] args) {
        int n = 100;

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.println("First " + n + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
