public ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> results = new ArrayList<>();

        int bestIndex1 = Integer.MAX_VALUE;
        int bestIndex2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            if (!map.containsKey(A.get(i))) {
                map.put(A.get(i), i);
            } else {

                int index1 = map.get(A.get(i));
                int index2 = i;

                if (A.get(index1) + A.get(index2) == B && index1 < index2) {

                    if ((index1 < bestIndex1 && index2 < bestIndex2) ||
                            (index2 < bestIndex2) ||
                            (index1 < bestIndex1 && index2 == bestIndex2)) {
                        bestIndex1 = index1;
                        bestIndex2 = index2;
                    }
                }
            }
        }


        for (int value1 : map.keySet()) {
            int index1 = map.get(value1);
            int value2 = B - value1;

            if (map.containsKey(value2)) {

                int index2 = map.get(value2);

                if (index1 < index2) {

                    if ((index1 < bestIndex1 && index2 < bestIndex2) ||
                            (index2 < bestIndex2) ||
                            (index1 < bestIndex1 && index2 == bestIndex2)) {
                        bestIndex1 = index1;
                        bestIndex2 = index2;
                    }
                }
            }
        }

        if (bestIndex1 == Integer.MAX_VALUE && bestIndex2 == Integer.MAX_VALUE) {
            return results;
        } else {
            results.add(bestIndex1 + 1);
            results.add(bestIndex2 + 1);
            return results;
        }
    }
