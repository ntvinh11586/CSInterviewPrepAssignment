// Complete the longestSubsequence function below.
static int longestSubsequence(String x, String y) {
    int maxlength = 0;

    for (int i = 0; i < y.length(); i++) {
        for (int j = i; j < y.length(); j++) {
            String subString = y.substring(i, j + 1);
            int sameTotalCount = 0;
            int subStringIndex = 0;
            for (int z = 0; z < x.length(); z++) {
                if (subStringIndex < subString.length() && x.charAt(z) == subString.charAt(subStringIndex)) {
                    sameTotalCount++;
                    subStringIndex++;
                }
            }

            if (sameTotalCount == subString.length() && sameTotalCount > maxlength) {
                maxlength = sameTotalCount;
            }
        }
    }

    return maxlength;
}
