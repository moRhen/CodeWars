package kyu7;
//http://www.codewars.com/kata/559590633066759614000063

class MinMax {
    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        java.util.Arrays.sort(arr);
        result[0] = arr[0];
        if (arr.length < 2) {
            result[1] = arr[0];
        } else {
            result[1] = arr[arr.length - 1];
        }
        return result;
    }
}
