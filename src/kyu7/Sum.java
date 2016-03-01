package kyu7;
//http://www.codewars.com/kata/55f2b110f61eb01779000053

import java.util.Arrays;

public class Sum {
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int[] container = new int[]{a, b};
            Arrays.sort(container);
            int result = 0;
            while (container[0] <= container[1]) {
                result += container[0];
                container[0] += 1;
            }
            return result;
        }
    }
}