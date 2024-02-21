import java.util.Scanner;

 class rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        // Variables to store reversed number and original number
        int reversedNum = 0;
        int originalNum = n;

        // Reverse the digits using while loop
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit from the original number
        }

        // Print the reversed number
        System.out.println("Reversed number of " + originalNum + " is: " + reversedNum);

        s.close();
    }
}
