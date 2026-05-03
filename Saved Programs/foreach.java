/* ✅ Problem: Full Array Analysis (for-each focused)

Create a program that does ALL of the following using for-each loop wherever possible:

Given an integer array
Find:
Sum of elements
Count of even numbers
Count of odd numbers
Maximum element
Check whether a given number exists in the array
Print all elements greater than the average */

class ForEachMaster {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};
        int key = 20;

        int sum = 0;
        int even = 0, odd = 0;
        int max = arr[0];

        // 1. Sum, Even, Odd, Max
        for (int x : arr) {
            sum += x;

            if (x % 2 == 0)
                even++;
            else
                odd++;

            if (x > max)
                max = x;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        System.out.println("Max: " + max);

        // 2. Check element exists
        boolean found = false;

        for (int x : arr) {
            if (x == key) {
                found = true;
                break;
            }
        }

        System.out.println("Element found: " + found);

        // 3. Average
        double avg = (double) sum / arr.length;

        // 4. Elements greater than average
        System.out.print("Greater than average: ");
        for (int x : arr) {
            if (x > avg)
                System.out.print(x + " ");
        }
    }
}
