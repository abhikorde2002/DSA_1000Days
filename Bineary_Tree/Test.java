package Bineary_Tree;

import java.util.HashSet;

public class Test {
    

    // Function to check if a given string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to find all common subsequences
    private static void findCommonSubsequences(String S1, String S2, String current, int i, int j, HashSet<String> commonSubsequences) {
        if (i == S1.length() || j == S2.length()) {
            if (!current.isEmpty()) {
                commonSubsequences.add(current);
            }
            return;
        }

        // If characters match, include in subsequence
        if (S1.charAt(i) == S2.charAt(j)) {
            findCommonSubsequences(S1, S2, current + S1.charAt(i), i + 1, j + 1, commonSubsequences);
        }
        
        // Move to the next character in S1
        findCommonSubsequences(S1, S2, current, i + 1, j, commonSubsequences);
        // Move to the next character in S2
        findCommonSubsequences(S1, S2, current, i, j + 1, commonSubsequences);
    }

    // Function to find the length of the longest common palindromic subsequence
    public static int longestCommonPalindromicSubsequence(String S1, String S2) {
        HashSet<String> commonSubsequences = new HashSet<>();
        
        // Find all common subsequences
        findCommonSubsequences(S1, S2, "", 0, 0, commonSubsequences);

        // Check each common subsequence for palindrome and find the maximum length
        int maxLength = 0;
        for (String subseq : commonSubsequences) {
            if (isPalindrome(subseq)) {
                maxLength = Math.max(maxLength, subseq.length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String S1 = "adfa";
        String S2 = "aagh";
        int result = longestCommonPalindromicSubsequence(S1, S2);
        System.out.println("Length of Longest Common Palindromic Subsequence: " + result);
        
        // Example for additional input
        String S3 = "acbda";
        String S4 = "fgaba";
        int result2 = longestCommonPalindromicSubsequence(S3, S4);
        System.out.println("Length of Longest Common Palindromic Subsequence: " + result2);
    }
}

