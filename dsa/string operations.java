class StringMaster {
    public static void main(String[] args) {

        String s = "I love Java programming";

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. charAt()
        System.out.println("First char: " + s.charAt(0));
        System.out.println("Last char: " + s.charAt(s.length() - 1));

        // 3. equals()
        String check = "I love Java programming";
        System.out.println("Equals check: " + s.equals(check));

        // 4. substring()
        int spaceIndex = s.indexOf(" ");
        String firstWord = s.substring(0, spaceIndex);
        System.out.println("First word: " + firstWord);

        // 5. toCharArray()
        char[] arr = s.toCharArray();
        System.out.print("Characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 6. split()
        String[] words = s.split(" ");
        System.out.println("Words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 7. indexOf()
        int pos = s.indexOf("Java");
        System.out.println("Position of 'Java': " + pos);

        // 8. StringBuilder (reverse)
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
