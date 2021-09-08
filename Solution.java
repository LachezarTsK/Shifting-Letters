public class Solution {

    public final int CHARS_IN_ALPHABET = 26;

    public String shiftingLetters(String s, int[] shifts) {

        char[] charArray = s.toCharArray();
        int shiftsForCurrentChar = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            shiftsForCurrentChar += shifts[i] % CHARS_IN_ALPHABET;
            charArray[i] = shiftChar(shiftsForCurrentChar, charArray[i]);
        }

        return String.valueOf(charArray);
    }

    public char shiftChar(int shiftsForCurrentChar, char ch) {
        int shiftedPositionInAlphabet = (shiftsForCurrentChar + ch - 'a') % CHARS_IN_ALPHABET;
        return (char) ('a' + shiftedPositionInAlphabet);
    }
}
