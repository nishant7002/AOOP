import java.util.Scanner;

class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter an index to find the character at that position: ");
        int index = scanner.nextInt();
        System.out.println("Character at index " + index + ": " + str.charAt(index));

        scanner.nextLine();
        System.out.println("Enter a sequence of characters to check if the string contains it: ");
        String sequence = scanner.nextLine();
        System.out.println("Does the string contain '" + sequence + "'? " + str.contains(sequence));

        System.out.println("Enter a word to format a string with it: ");
        String word = scanner.nextLine();
        String formattedString = String.format("This is a %s", word);
        System.out.println(formattedString);

       
        System.out.println("Length of the string: " + str.length());

        System.out.println("Enter a delimiter to split the string: ");
        String delimiter = scanner.nextLine();
        String[] parts = str.split(delimiter);
        System.out.println("Splitting the string:");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }
}
