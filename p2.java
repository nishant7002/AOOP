import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter three numbers:");
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();

        // Find the maximum using conditional operator
        double max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

        // Print the maximum number
        System.out.println("Maximum of three numbers is: " + max);

        s.close();
    }
}
