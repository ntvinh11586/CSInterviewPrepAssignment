public class Solution {

    public int compareVersion(String A, String B) {
        String[] a = A.split("\\.");
        String[] b = B.split("\\.");

        for (int i = 0; i < Math.max(a.length, b.length); i++) {

            if (i >= a.length) {

                String number = b[i].trim().replaceFirst("^0+(?!$)", "");
                if (i <= b.length - 1 && !number.equals("0")) {
                    return -1;
                } else {
                    return 0;
                }
            }

            if (i >= b.length) {

                String number = a[i].trim().replaceFirst("^0+(?!$)", "");
                if (i <= a.length - 1 && !number.equals("0")) {
                    return 1;
                } else {
                    return 0;
                }
            }

            String number1 = a[i].trim().replaceFirst("^0+(?!$)", "");
            String number2 = b[i].trim().replaceFirst("^0+(?!$)", "");

            if (number1.length() > number2.length()) {
                return 1;
            }

            if (number2.length() > number1.length()) {
                return -1;
            }

            if (number1.compareTo(number2) > 0) {
                return 1;
            }

            if (number1.compareTo(number2) < 0) {
                return -1;
            }
        }

        return 0;
    }
}
