public class Primes {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");

        
        for (int num = 2; num <= 500; num++) {
            boolean isPrime = true;

            
            for (int divisor = 2; divisor <= num/2; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}