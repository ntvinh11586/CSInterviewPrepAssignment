public class Solution {

    public String reverseWords(String a) {

        String[] words = a.split("[ ]+");

        String[] reservedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reservedWords[words.length - i - 1] = words[i];
        }

        return String.join(" ", reservedWords);
    }
}
