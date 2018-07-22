public class Solution {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {

        List<Integer> maxSubList = new ArrayList<Integer>();

        ArrayList<Long> sum = new ArrayList<Long>();
        for (int i = 0; i < A.size(); i++) {
            if (i == 0)  {
                sum.add((long) A.get(i));
            } else {
                sum.add(sum.get(i - 1) + A.get(i));
            }
        }

        long maxValue = -1;
        int maxLength = 0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {

                if (A.get(j) < 0) {
                    i = j + 1;
                    continue;
                }

                List<Integer> subList = A.subList(i, j + 1);
                long subValue = A.get(i) + sum.get(j) - sum.get(i);
                if ((maxValue < subValue || (maxValue == subValue && maxLength < subList.size()))) {
                    maxSubList = subList;
                    maxValue = subValue;
                    maxLength = subList.size();
                }
            }
        }

        return new ArrayList<Integer>(maxSubList);
    }
}
