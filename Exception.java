public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;  // This will cause a division by zero

        try {
            // Code that might throw an exception
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Code that runs when exception occurs
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block always runs, no matter what
            System.out.println("This is the finally block.");
        }

        System.out.println("Program continues...");
    }
}

