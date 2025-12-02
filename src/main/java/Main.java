import java.util.Scanner;

public class Main {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;       // memory for current value
        boolean firstTime = true;

        while (true) {
            double num;
            if (firstTime) {
                System.out.print("Enter number: ");
                num = sc.nextDouble();
                result = num;
                firstTime = false;
            }

            System.out.print("Enter operator (+, -, *, /, %, or x to exit): ");
            char operator = sc.next().charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter next number: ");
            num = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = result + num;
                    break;
                case '-':
                    result = result - num;
                    break;
                case '*':
                    result = result * num;
                    break;
                case '/':
                    if (num != 0) result = result / num;
                    else System.out.println("Error: Divide by zero!");
                    break;
                case '%':
                    result = result % num;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println(); // for readability
        }

        sc.close();
    }
}

       
       
