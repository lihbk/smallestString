package com.example.smallestString;

public class SmallestString {

    public static String findSmallestSubstring(String str, String pattern) {
        int[] freqMap = new int[256]; // Assuming ASCII character set
        int count = 0, minLength = Integer.MAX_VALUE, startIndex = -1;

        // Create frequency map for pattern
        for (int i = 0; i < pattern.length(); i++) {
            freqMap[pattern.charAt(i)]++;
        }

        // Traverse the string
        for (int left = 0, right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (freqMap[ch] > 0) {
                count++;
            }
            freqMap[ch]--;

            // If substring contains all characters of pattern
            if (count == pattern.length()) {
                // Minimize the substring by moving left pointer
                while (freqMap[str.charAt(left)] < 0) {
                    freqMap[str.charAt(left)]++;
                    left++;
                }
                // Update minimum length substring
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                    startIndex = left;
                }
            }
        }

        return (startIndex == -1) ? "" : str.substring(startIndex, startIndex + minLength);
    }
}
