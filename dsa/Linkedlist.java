import java.util.LinkedList;

class LinkedListAnalyzer {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. Add elements
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(20);

        // 2. Print elements
        System.out.print("Original List: ");

        for (int x : list) {
            System.out.print(x + " ");
        }

        System.out.println();

        // 3. Sum, Max, Even, Odd
        int sum = 0;
        int max = list.getFirst();

        int even = 0;
        int odd = 0;

        for (int x : list) {

            sum += x;

            if (x > max)
                max = x;

            if (x % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        // 4. Search element
        int key = 5;

        if (list.contains(key))
            System.out.println(key + " found");
        else
            System.out.println(key + " not found");

        // 5. Remove duplicates
        LinkedList<Integer> unique = new LinkedList<>();

        for (int x : list) {

            if (!unique.contains(x))
                unique.add(x);
        }

        System.out.println("Without duplicates: " + unique);

        // 6. Rotate by one position
        int last = list.removeLast();

        list.addFirst(last);

        System.out.println("Rotated List: " + list);

        // 7. Split even and odd
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();

        for (int x : list) {

            if (x % 2 == 0)
                evenList.add(x);
            else
                oddList.add(x);
        }

        System.out.println("Even List: " + evenList);
        System.out.println("Odd List: " + oddList);
    }
}
