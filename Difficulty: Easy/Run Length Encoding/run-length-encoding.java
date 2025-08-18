class Solution {
    public static String encode(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        // Add the last character group
        result.append(s.charAt(s.length() - 1)).append(count);

        return result.toString();
    }
}