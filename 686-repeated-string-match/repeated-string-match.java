class Solution {
    public int repeatedStringMatch(String textStr, String pattern) {
        StringBuilder text = new StringBuilder(textStr);
        int result = 1;

        // Repeat text until its length >= pattern
        while (text.length() < pattern.length()) {
            text.append(textStr);
            result++;
        }

        // Try one more repeat to cover wrap-around matches
        if (text.indexOf(pattern) != -1) return result;
        text.append(textStr);
        result++;
        if (text.indexOf(pattern) != -1) return result;

        return -1;
    }
}