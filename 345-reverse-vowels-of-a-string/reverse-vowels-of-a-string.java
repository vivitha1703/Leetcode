class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0, end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(sb.charAt(start))) {
                start++;
            }
            while (start < end && !isVowel(sb.charAt(end))) {
                end--;
            }

            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);

            start++;
            end--;
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
