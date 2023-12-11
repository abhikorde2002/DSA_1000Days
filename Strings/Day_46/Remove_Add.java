package Strings.Day_46;

public class Remove_Add {
    public static void main(String[] args) {
        String s="aa";
        System.out.println(tryle(s));
    }
    static int tryle(String word){
        char[] chars = word.toCharArray();
        int operations = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1] || isAlmostEqual(chars[i], chars[i - 1])) {
                // Change the current character to any other letter
                chars[i] = getNextLetter(chars[i - 1]);
                ++operations;
            }
            if(i<chars.length &&  chars[i]==chars[i-1]){
                operations++;
            }
        }

        return operations-1;
    }

    // Check if two characters are almost equal
    private static boolean isAlmostEqual(char a, char b) {
        return Math.abs(a - b) == 1 || Math.abs(a - b) == 25 || a == b; // Consider 'a' and 'z' as adjacent, also check for equality
    }

    // Get the next letter in the alphabet that is different from the given letter
    private static char getNextLetter(char letter) {
        return (letter == 'a' || letter == 'z') ? 'b' : (char) (letter + 1);
    }
}
