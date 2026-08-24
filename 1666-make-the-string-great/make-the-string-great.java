class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();

            // Check if the current character forms a bad pair with the last character in sb
            if (len > 0 && Math.abs(sb.charAt(len - 1) - c) == 32) {
                sb.deleteCharAt(len - 1); // Pop the adjacent character
            } else {
                sb.append(c);             // Push the character
            }
        }

        return sb.toString();
    }
}