import java.util.Scanner;

public class FindElementInArray {
    public static int findElementInArray(int arr [], int number){
        int element = -1;
        for(int i = 0; i< arr.length; i++){
            if (arr[i]==number){
                element = i;
            }
        }
        return element;
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

        System.out.println("Enter number to search : ");
        int element = scn.nextInt();

        int number = findElementInArray(arr, element);
        System.out.println("Number is : "+number);
    }
}
