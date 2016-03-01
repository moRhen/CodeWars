package kyu7;
//http://www.codewars.com/kata/54ff0d1f355cfd20e60001fc

public class Factorial {

    public int result;

    public int factorial(int n) {
        if (n == 0) {
            result = 1;
        } else if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        } else {
            result = n;
            while (n > 1) {
                n--;
                result *= n;
            }
        }
        return result;
    }
}
