import java.util.Stack;

class StackMaster {
    public static void main(String[] args) {

        // 1. Create Stack
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }

        // 2. Print Info
        System.out.println("Stack: " + stack);

        System.out.println("Size: " + stack.size());

        System.out.println("Top Element: " + stack.peek());

        // 3. Sum, Max, Even, Odd
        int sum = 0;
        int max = stack.get(0);

        int even = 0, odd = 0;

        for (int x : stack) {

            sum += x;

            if (x > max)
                max = x;

            if (x % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Sum = " + sum);

        System.out.println("Max = " + max);

        System.out.println("Even Count = " + even);

        System.out.println("Odd Count = " + odd);

        // 4. Reverse String
        String s = "hello";

        Stack<Character> strStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            strStack.push(s.charAt(i));
        }

        String rev = "";

        while (!strStack.isEmpty()) {
            rev += strStack.pop();
        }

        System.out.println("Reversed String: " + rev);

        // 5. Palindrome Check
        String word = "madam";

        Stack<Character> palStack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            palStack.push(word.charAt(i));
        }

        String reversed = "";

        while (!palStack.isEmpty()) {
            reversed += palStack.pop();
        }

        if (word.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // 6. Reverse Numbers Using Pop
        Stack<Integer> nums = new Stack<>();

        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);

        System.out.print("Reverse Numbers: ");

        while (!nums.isEmpty()) {
            System.out.print(nums.pop() + " ");
        }

        System.out.println();

        // 7. Balanced Parentheses
        String brackets = "(())";

        Stack<Character> bracketStack = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < brackets.length(); i++) {

            char ch = brackets.charAt(i);

            if (ch == '(') {
                bracketStack.push(ch);
            }

            else if (ch == ')') {

                if (bracketStack.isEmpty()) {
                    valid = false;
                    break;
                }

                bracketStack.pop();
            }
        }

        if (!bracketStack.isEmpty())
            valid = false;

        if (valid)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
