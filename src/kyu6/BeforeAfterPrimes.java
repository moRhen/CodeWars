package kyu6;
//http://www.codewars.com/kata/560b8d7106ede725dd0000e2

public class BeforeAfterPrimes {

    public static long[] primeBefAft(long num) {
        long[] result = new long[2];

        for (long i = num - 1; i > 1; i--) {
            if (isPrime(i)) {
                result[0] = i;
                break;
            }
        }
        for (long i = num + 1; i < Long.MAX_VALUE; i++) {
            if (isPrime(i)) {
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
