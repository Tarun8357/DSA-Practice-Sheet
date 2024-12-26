import java.util.Scanner;

public class SumOfArrays {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int index1 = scn.nextInt();
        int arr1[] = new int[index1];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }

        int index2 = scn.nextInt();
        int arr2[] = new int[index2];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
    }
}
