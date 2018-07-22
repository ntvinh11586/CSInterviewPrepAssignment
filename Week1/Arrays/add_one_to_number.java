public class Solution {
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {

				int i = 0;
        while (i < a.size() - 1 && a.get(i) == 0) {
            a.remove(i);
        }

				int carry = 1;
				if (a.size() == 0) {
					a.add(0, carry);
					return a;
				}

        int sum;
        for (i = a.size() - 1; i >= 0; i--) {
            sum = a.get(i) + carry;
            a.set(i, sum % 10);
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
        }

        return a;
	}
}
