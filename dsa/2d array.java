class MatrixAnalyzer {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };

        // 1. Print Matrix
        System.out.println("Matrix:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        // 2. Sum and Largest
        int sum = 0;
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];

                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + max);

        // 3. Main Diagonal
        System.out.print("Main Diagonal: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        System.out.println();

        // 4. Secondary Diagonal
        System.out.print("Secondary Diagonal: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }

        System.out.println();

        // 5. Row-wise Sum
        for (int i = 0; i < arr.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }

            System.out.println("Row " + i + " Sum = " + rowSum);
        }

        // 6. Column-wise Sum
        for (int j = 0; j < arr[0].length; j++) {

            int colSum = 0;

            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }

            System.out.println("Column " + j + " Sum = " + colSum);
        }

        // 7. Symmetric Check
        boolean symmetric = true;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");
    }
}
