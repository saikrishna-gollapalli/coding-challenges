package com.sktech.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

    public static void main(String[] args) {
        Long[] arr = new Long[]{1l, 5l, 5l, 25l, 125l};
        long result = calculateTriplet(Arrays.asList(arr), 5);
        System.out.println("Result :: " + result);
    }

    private static long calculateTriplet(List<Long> arr, long r) {
        //Solution-1
        /*long result = 0;
        for (int i = 0; i < arr.size(); i++) {
            long first = arr.get(i) * r;
            for (int j = i + 1; j < arr.size(); j++) {
                if (first == arr.get(j)) {
                    long second = first * r;
                    for (int k = j + 1; k < arr.size(); k++) {
                        if (second == arr.get(k)) {
                            result += 1;
                            System.out.println("(" + i + "," + j + "," + k + ")");
                        }
                    }
                }
            }
        }
        return result;*/
        //Solution-2
        Map<Long, Long> rightMap = getOccurenceMap(arr);
        Map<Long, Long> leftMap = new HashMap<>();
        long numberOfGeometricPairs = 0;

        for (long val : arr) {
            long countLeft = 0;
            long countRight = 0;
            long lhs = 0;
            long rhs = val * r;
            if (val % r == 0) {
                lhs = val / r;
            }
            Long occurence = rightMap.get(val);
            rightMap.put(val, occurence - 1L);

            if (rightMap.containsKey(rhs)) {
                countRight = rightMap.get(rhs);
            }
            if (leftMap.containsKey(lhs)) {
                countLeft = leftMap.get(lhs);
            }
            numberOfGeometricPairs += countLeft * countRight;
            insertIntoMap(leftMap, val);
        }
        return numberOfGeometricPairs;
    }

    private static Map<Long, Long> getOccurenceMap(List<Long> test) {
        Map<Long, Long> occurenceMap = new HashMap<>();
        for (long val : test) {
            insertIntoMap(occurenceMap, val);
        }
        return occurenceMap;
    }

    private static void insertIntoMap(Map<Long, Long> occurenceMap, Long val) {
        if (!occurenceMap.containsKey(val)) {
            occurenceMap.put(val, 1L);
        } else {
            Long occurence = occurenceMap.get(val);
            occurenceMap.put(val, occurence + 1L);
        }
    }
}
