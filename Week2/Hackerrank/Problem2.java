static int maxLength(List<Integer> a, int k) {
    ArrayList<Integer> sum = new ArrayList<Integer>();
    for (int i = 0; i < a.size(); i++) {
        if (i == 0) sum.add(a.get(i));
        else sum.add(sum.get(i - 1) + a.get(i));
    }

    int maxLength = 0;
    for (int i = 0; i < sum.size(); i++) {
        for (int j = i; j < sum.size(); j++) {
            int value = sum.get(j) - sum.get(i) + a.get(i);
            if (value <= k && j - i + 1 > maxLength) {
                maxLength = j - i + 1;
            }
        }
    }

    return maxLength;
}
