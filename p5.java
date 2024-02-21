import java.util.Scanner;

class PrimeNumbersGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to generate first n prime numbers: ");
        int n = scanner.nextInt();
        int count = 0;
        int num = 2; // the number to be tested for primality

        System.out.println("First " + n + " prime numbers are: ");
        while (count < n) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        scanner.close();
    }
}
