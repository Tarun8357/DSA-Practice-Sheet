/*
 * Problem Statement:
 * Write a Java program to find the maximum and minimum numbers in an array.
 * 
 * Requirements:
 * - Define two separate methods:
 *   1. maximumNumber(): Accepts an integer array and returns the maximum number in the array.
 *   2. minimumNumber(): Accepts an integer array and returns the minimum number in the array.
 * 
 * Input:
 * - An integer array `arr` containing one or more integers.
 * 
 * Output:
 * - Print the maximum number in the array.
 * - Print the minimum number in the array.
 * 
 * Example:
 * Input: arr = [3, 5, 2, 7, 88, 7, 5]
 * Output:
 * Max Number: 88
 * Min Number: 2
 * 
 * Constraints:
 * - 1 ≤ arr.length ≤ 10^6
 * - Array elements can be positive or negative integers.
 * - The program should handle edge cases like arrays with all positive, all negative, or mixed numbers.
 */


import java.util.Scanner;

public class FindMaxAndMin {
    // Method for find maximum number
    public static int maximumNumber(int arr []){
        int maxValue = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // Method for find minimum number
    public static int minimumNumber(int arr[]){
        int minValue = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
       int [] arr = {3,5,2,7,88,7,5};
       int maxNumber = maximumNumber(arr);
       System.out.println("Max Number : "+ maxNumber);
       int minNumber = minimumNumber(arr);
       System.out.println("Min Number : "+ minNumber);
    }
}
