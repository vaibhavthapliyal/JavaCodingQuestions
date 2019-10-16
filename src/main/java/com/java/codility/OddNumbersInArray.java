package com.java.codility;

import java.util.HashMap;
import java.util.Map;

public class OddNumbersInArray {
    public int solution(int[] A) {
        Map<Integer,Integer> duplicateCountMap = new HashMap<>();

        for (int i = 0; i<A.length; i++){
            if (duplicateCountMap.containsKey(A[i])){
                duplicateCountMap.remove(A[i]);
            }else{
                duplicateCountMap.put(A[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:duplicateCountMap.entrySet()){
            return entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {

        int a[] = {9,3,9,3,9,7,9};
        OddNumbersInArray obj = new OddNumbersInArray();
        System.out.println(obj.solution(a));
    }
}
