public class Example31 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]); // allowed just to parse input

            System.out.println("Given Number: " + num);
            System.out.println("Binary equivalent: " + toBinary(num));
            System.out.println("Octal equivalent: " + toOctal(num));
            System.out.println("Hexadecimal equivalent: " + toHex(num));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    static String toBinary(int n) {
        return convertToBase(n, 2);
    }

    static String toOctal(int n) {
        return convertToBase(n, 8);
    }

    static String toHex(int n) {
        return convertToBase(n, 16);
    }

    static String convertToBase(int n, int base) {
        if (n == 0) return "0";

        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % base;
            result.insert(0, digits.charAt(remainder));
            n /= base;
        }

        return result.toString();
    }
}
