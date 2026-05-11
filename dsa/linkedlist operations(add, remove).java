import java.util.LinkedList;

class LinkedListMaster {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. Add operations
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);

        list.addLast(40);

        list.add(2, 15);

        // 2. Print list
        System.out.println("LinkedList: " + list);

        // 3. Remove operations
        list.removeFirst();

        list.removeLast();

        list.remove(1);

        // 4. Print after removal
        System.out.println("After removal: " + list);

        // 5. Get operations
        System.out.println("First element: " + list.getFirst());

        System.out.println("Last element: " + list.getLast());

        System.out.println("Element at index 1: " + list.get(1));

        // 6. Size
        System.out.println("Size: " + list.size());

        // 7. Traversal
        System.out.print("Elements: ");

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
