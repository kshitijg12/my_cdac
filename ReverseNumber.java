public class ReverseNumber {
    public static void main(String[] args) {
        // Initialize a number
        int number = 12345;

        // Reverse the digits
        int reversedNumber = reverseDigits(number);

        // Display the results
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    // Function to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
