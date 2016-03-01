package kyu6;
//http://www.codewars.com/kata/5254bd1357d59fbbe90001ec

public class Sequence {
    public static long getScore(long n) {
        long result = 0;
        for (long i = 1; i <= n; i++) {
            result += i * 50;
        }
        return result;
    }
}
