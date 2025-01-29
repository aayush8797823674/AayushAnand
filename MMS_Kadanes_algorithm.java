import java.util.Scanner;

public class MMS_Kadanes_algorithm {
    
    public static void max(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        
        System.out.println("Max Sum = "+ maxSum);
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

            max(arr);
        }
    }
}
