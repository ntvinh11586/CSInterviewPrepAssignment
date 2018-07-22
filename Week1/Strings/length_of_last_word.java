public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {

        if (A.length() == 0) return 0;

        String[] words = A.split(" ");

        if (words.length == 0) return 0;

        return words[words.length - 1].length();
    }
}
