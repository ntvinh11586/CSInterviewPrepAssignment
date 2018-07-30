public class Solution {


    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (i == 0) sum.add(A.get(i));
            else sum.add(sum.get(i - 1) + A.get(i));
        }

        int maxLength = 0;
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                int subSum = sum.get(j) - sum.get(i) + A.get(i);
                if (subSum == 0 && maxLength < j - i + 1) {
                    maxList = A.subList(i, j + 1);
                    maxLength = j - i + 1;
                }
            }
        }

        return new ArrayList<>(maxList);
    }

//    Best solution: Use Hash
//    public ArrayList<Integer> lszero(ArrayList<Integer> a) {
//
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//
//        int sum = 0;
//
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        map.put(0, -1);
//        int start = 0;
//        //int end = 0;
//        int length = 0;
//        for (int i = 0; i < a.size(); i++){
//            sum += a.get(i);
//            if (map.containsKey(sum)){
//                int last = map.get(sum);
//                if (i - last > length){
//                    start = last;
//                    length = i - last;
//                }
//            }else{
//                map.put(sum, i);
//            }
//        }
//
//        for (int i = 0; i < length; i++){
//            ans.add(a.get(start + 1 + i));
//        }
//
//        return ans;
//
//    }
}
