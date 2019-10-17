package com.java.geeksforgeeks;


/**
 * Given a number N. The task is to complete the function convertFive() which replace all zeros in the number with 5 and returns the number.
 *
 * Input:
 * The first line of input contains an integer T, denoting the number of testcases. Then T testcases follow. Each testcase contains a single integer N denoting the number.
 *
 * Output:
 * The function will return integer where all zero's are converted to 5.
 *
 * User Task:
 * Since this is a functional problem you don't have to worry about input, you just have to complete the function convertFive().
 *
 * Constraints:
 * 1 <= T <= 103
 * 1 <= N <= 104
 *
 * Example:
 * Input
 * 2
 * 1004
 * 121
 *
 * Output
 * 1554
 * 121
 *
 * Explanation:
 * Testcase 1:  At index 1 and 2 there is 0 so we replace it with 5.
 * Testcase 2: There is no ,0 so output will remain same.
 */
public class Replace0With5 {
    public static int convertFive(int n){
        int number = 0;
        int factor = 1;
        while(n != 0){
            int remainder = n%10;
            if(remainder == 0){
                number = number + 5 * factor;
            }else{
                number = number + remainder * factor;
            }

            factor = factor * 10;
            n = n/10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(convertFive(1004));
    }
}
