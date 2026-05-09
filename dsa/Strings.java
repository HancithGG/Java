class StringAnalyzer {
    public static void main(String[] args) {

        String s = "madam program";
        
        int chars = 0;
        int vowels = 0;
        int consonants = 0;

        // Count characters, vowels, consonants
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch != ' ') {
                chars++;

                if (ch >= 'a' && ch <= 'z') {
                    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        vowels++;
                    else
                        consonants++;
                }
            }
        }

        System.out.println("Characters (no spaces): " + chars);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Reverse string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reversed: " + rev);

        // Palindrome check (ignore spaces)
        String original = s.replace(" ", "");
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
