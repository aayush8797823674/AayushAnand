import java.util.Scanner;

public class Reverse_array {
    
    public static void reverse_array(int arr[]){
        
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++) {
                System.out.print("Enter number at index " + i + " : ");
                arr[i] = sc.nextInt();
            }

            reverse_array(arr);
            System.out.print("Reverse Array is : ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            
        }
    }
}
