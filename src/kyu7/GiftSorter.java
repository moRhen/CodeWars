package kyu7;
//http://www.codewars.com/kata/52aeb2f3ad0e952f560005d3

import java.util.Arrays;

public class GiftSorter {

    public String sortGiftCode(String code) {

        Character[] chars = new Character[code.length()];

        for (int i = 0; i < code.length(); i++) {
            chars[i] = code.charAt(i);
        }

        Arrays.sort(chars);
        StringBuilder tempResult = new StringBuilder(chars.length);
        for (char c : chars) tempResult.append(c);
        String result = tempResult.toString();

        return result;
    }
}
