/*
 * Problem Statement:
 * Write a program to categorize numbers in an array into the following categories:
 * 1. Even Numbers: Numbers that are divisible by 2.
 * 2. Odd Numbers: Numbers that are not divisible by 2.
 * 3. Prime Numbers: Numbers greater than 1 that are divisible only by 1 and themselves.
 * 
 * Requirements:
 * - Define three separate methods for identifying each category:
 *   a) evenNumber() - Returns an array of even numbers.
 *   b) oddNumber() - Returns an array of odd numbers.
 *   c) primeNumber() - Returns an array of prime numbers.
 * 
 * Input:
 * - An integer array `arr` containing integers.
 * 
 * Output:
 * - Three separate outputs:
 *   a) A list of even numbers from the array.
 *   b) A list of odd numbers from the array.
 *   c) A list of prime numbers from the array.
 * 
 * Example:
 * Input: arr = [1, 3, 4, 6, 5, 3, 8, 6, 44]
 * Output:
 * Even Numbers: 4 6 8 6 44
 * Odd Numbers: 1 3 5 3
 * Prime Numbers: 3 5 3
 * 
 * Constraints:
 * - 1 ≤ arr.length ≤ 10^6
 * - Array elements can be positive or negative integers, but only positive numbers 
 *   are considered for prime numbers.
 * - The output arrays should not include any extra zeroes or placeholders.
 */

public class EvenOddPrimeNumbers {
    public static int[] evenNumber(int arr []){
        int container [] = new int[arr.length];
        int containerIndex = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index]%2==0){
                container[containerIndex++] = arr[index];
            }
        }
        // Trim the array to include only even numbers
        int[] result = new int[containerIndex];
        for (int i = 0; i < containerIndex; i++) {
            result[i] = container[i];
        }
    
        return result;
    }

    public static int [] oddNumber(int arr []){
        int container [] = new int[arr.length];
        int containerIndex = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index]%2==1){
                container[containerIndex++] = arr[index];
            }
        }
        // Trim the array to include only odd numbers
        int[] result = new int[containerIndex];
        for (int i = 0; i < containerIndex; i++) {
            result[i] = container[i];
        }
    
        return result;
    }

    public static int[] primeNumber(int arr[]) {
        int[] container = new int[arr.length]; // Output array
        int containerIndex = 0; // Index to track insertion into container
    
        for (int index = 0; index < arr.length; index++) {
            int number = arr[index];
            if (isPrime(number)) {
                container[containerIndex++] = number; // Add prime to container
            }
        }
    
        // Trim the array to include only prime numbers
        int[] result = new int[containerIndex];
        for (int i = 0; i < containerIndex; i++) {
            result[i] = container[i];
        }
    
        return result;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Found a divisor
        }
        return true;
    }
    public static void main(String[] args) {
        int arr [] = {1,3,4,6,5,3,8,6,44};

        // For even Numbers
        int [] evenNumber = evenNumber(arr);
        System.out.print("Even Numbers : ");
        for (int i : evenNumber) {
            System.out.print(i+" ");
            
        }

        System.out.println();

        // For odd numbers
        int [] oddNumber = oddNumber(arr);
        System.out.print("Odd Numbers : ");
        for (int i : oddNumber) {
            System.out.print(i+" ");
            
        }
        
        System.out.println();

        // For prime numbers
        int [] primeNumber = primeNumber(arr);
        System.out.print("Prime Numbers : ");
        for (int i : primeNumber) {
            System.out.print(i+" ");
            
        }
    }
}
