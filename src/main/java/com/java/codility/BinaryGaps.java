package com.java.codility;

public class BinaryGaps {

    public int solution(int N) {
        int currBinaryGap = 0;
        int highestBinaryGap = 0;
        String binaryString = Integer.toBinaryString(N);
        String [] stringArray = binaryString.split("");
        for(String binaryValue: stringArray){
            if(binaryValue.equals("0")){
                currBinaryGap++;
            }else{
                if(currBinaryGap > highestBinaryGap){
                    highestBinaryGap = currBinaryGap;
                }
                currBinaryGap = 0;
            }
        }
        return highestBinaryGap;
    }

    public static void main(String[] args) {
        BinaryGaps gaps = new BinaryGaps();
        System.out.println(gaps.solution(9));
    }
}
