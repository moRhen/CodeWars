package kyu7;
//http://www.codewars.com/kata/566efcfbf521a3cfd2000056

public class FunReverse {

    public static String result;

    public static String funReverse(String s) {

        result = new StringBuilder(s).reverse().toString();

        for (int i = 1; i < s.length(); i++) {
            result = (result.substring(0, i)) + (new StringBuilder(result.substring(i, result.length())).reverse().toString());
        }
        return result;
    }
}
