/*
 * Problem Statement:
 * Given an array of integers, find the span between the maximum and minimum numbers.
 * The span is defined as the difference in their indices.
 * If the maximum and minimum numbers appear multiple times, consider the first occurrence of each.
 *
 * Example 1:
 * Input: arr = [8, 1, 3, 6, 1, 9, 4]
 * Output: 5
 * Explanation: 
 *   - Maximum number = 9 at index 5.
 *   - Minimum number = 1 at index 1.
 *   - Span = 5 - 1 = 4.
 *
 * Example 2:
 * Input: arr = [10, 15, 5, 20, 5, 25]
 * Output: 4
 * Explanation:
 *   - Maximum number = 25 at index 5.
 *   - Minimum number = 5 at index 2.
 *   - Span = 5 - 2 = 3.
 *
 * Constraints:
 * 1. Array size is at least 2.
 * 2. Array elements are integers and may contain duplicates.
 * 3. Negative numbers are allowed.
 *
 * Expected Time Complexity: O(n)
 * Approach:
 * 1. Traverse the array once to find the maximum and minimum numbers and their first occurrences.
 * 2. Compute the span as the absolute difference between their indices.
 */

import java.util.Scanner;

public class FindSpan {
    public static int findSpan(int arr []){
        int maxValue = arr[0];
        int minValue = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        int span = maxValue - minValue;
        return span;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr [] ;
        System.out.println("Enter the index : ");
        int index = scn.nextInt();
        arr = new int[index];
        System.out.println("Enter the Numbers : ");
        for(int i = 0; i < index; i++){
            arr[i] = scn.nextInt();
        }

        int span = findSpan(arr);
        System.out.println("Span of numbers : " + span);
    }
    
}
