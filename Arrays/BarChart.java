import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the index : ");
        int index = scn.nextInt();

        int arr [];
        arr = new int[index];

        System.out.println("Enter the Numbers : ");
        for(int i = 0; i < arr.length; i++){
            arr[i]= scn.nextInt();
        }

        int max = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        for(int floor = max; floor >=1; floor--){
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
