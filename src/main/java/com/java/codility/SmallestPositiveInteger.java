package com.java.codility;

import java.util.*;

public class SmallestPositiveInteger {
    public int solution(int[] A) {
        Arrays.sort(A);

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<A.length; i++){
            set.add(A[i]);
        }

        int smallestInteger = 1;

        while(set.contains(smallestInteger)){
            smallestInteger++;
        }
        return  smallestInteger;
    }

    public static void main(String[] args) {
        int A[] = {-1,-3};

        SmallestPositiveInteger obj = new SmallestPositiveInteger();

         System.out.println(obj.solution(A));
    }
}
