public class Solution {
    public int isPalindrome(String A) {

        if (A.length() == 1) {
            return 1;
        }

        int i = 0;
        int j = A.length() - 1;

        while (i < j) {

            while (i <= A.length() - 1
                && !(48 <= Character.toLowerCase(A.charAt(i)) && Character.toLowerCase(A.charAt(i)) <= 57)
                && !(97 <= Character.toLowerCase(A.charAt(i)) && Character.toLowerCase(A.charAt(i)) <= 122)) {
                i++;
            }

            while (j >= 0
                && !(48 <= Character.toLowerCase(A.charAt(j)) && Character.toLowerCase(A.charAt(j)) <= 57)
                && !(97 <= Character.toLowerCase(A.charAt(j)) && Character.toLowerCase(A.charAt(j)) <= 122)) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if ((Character.toLowerCase(A.charAt(i)) != Character.toLowerCase(A.charAt(j)))) {
                return 0;
            } else {
                i++;
                j--;
            }
        }

        return 1;
    }
}
