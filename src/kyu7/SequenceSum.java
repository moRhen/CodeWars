package kyu7;
//http://www.codewars.com/kata/5436f26c4e3d6c40e5000282

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n) + 1];
        int counter = 1;
        result[0] = 0;
        if (n > 0) {
            while (counter <= n) {
                result[counter] = result[counter - 1] + counter;
                counter++;
            }
        } else if (n < 0) {
            while (-(counter) >= n) {
                result[counter] = result[counter - 1] - counter;
                counter++;
            }
        }
        return result;
    }
}
