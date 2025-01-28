import java.util.Scanner;

public class Largest_in_array {
    
    public static void largest(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest in Array is : "+ largest);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                System.out.print("Enter number at index " + i + " : ");
                arr[i] = sc.nextInt();
            }

            largest(arr);
        }
    }
}
