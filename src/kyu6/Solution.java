package kyu6;
//http://www.codewars.com/kata/514b92a657cdc65150000006

public class Solution {

    public int result;
    public int counter = 3;

    public int solution(int number) {
        if (number < 3) {
            throw new IllegalArgumentException("Give me 3 or more");
        } else {
            while (counter < number) {
                if (counter % 3 == 0 || counter % 5 == 0) {
                    result += counter;
                }
                counter++;
            }
            return result;
        }
    }
}
