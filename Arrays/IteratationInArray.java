import java.util.Scanner;

public class IteratationInArray {
    public static int setValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Values:");
        int values = scanner.nextInt();
        return values;
    }

    public static void main(String[] args) {
        System.out.println("Enter the index :" );
        int index =setValues();
        int arr[];
        arr = new int[index];
        for (int i = 0; i <5; i++){
            System.out.println("Enter the value:");
            arr[i] = setValues(); 
        }
        for (int i = 0; i <5; i++){
            System.out.println(arr[i]);
        }

        
    }
    
}