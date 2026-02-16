//Utility Calculator which takes number in parameters and gives return value for add, square, n Power

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int square(int n) {
        return n * n;
    }

    int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum: " + c.add(10, 5));
        System.out.println("Square: " + c.square(4));
        System.out.println("Power: " + c.power(2, 3));
    }
}
