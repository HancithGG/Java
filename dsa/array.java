/*✅ Problem: Analyze an Array

Create a program that does ALL of the following:

Take an integer array (hardcode or input).
Find:
Sum of elements
Maximum element
Minimum element
Reverse the array (in same array).
Check whether the array is sorted (ascending or not).
Print all results clearly. */

class ArrayAnalysis {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        // 1. Sum, Max, Min
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // 2. Reverse Array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed Array: ");
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();

        // 3. Check Sorted
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
