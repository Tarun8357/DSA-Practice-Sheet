import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input the first array
        System.out.print("Enter the size of the first array: ");
        int index1 = scn.nextInt();
        int arr1[] = new int[index1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        // Input the second array
        System.out.print("Enter the size of the second array: ");
        int index2 = scn.nextInt();
        int arr2[] = new int[index2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        // Determine the size of the result array
        int sum[] = new int[Math.max(index1, index2) + 1];
        int carry = 0;

        // Pointers for traversing arrays from the end
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        // Calculate the sum
        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += arr1[i];
                i--;
            }
            if (j >= 0) {
                digit += arr2[j];
                j--;
            }
            carry = digit / 10;
            sum[k] = digit % 10;
            k--;
        }

        // Print the result array
        System.out.println("Sum of the arrays:");
        for (int x = 0; x < sum.length; x++) {
            // Skip leading zeros unless it's the only digit
            if (x == 0 && sum[x] == 0) continue;
            System.out.print(sum[x] + " ");
        }
    }
}
