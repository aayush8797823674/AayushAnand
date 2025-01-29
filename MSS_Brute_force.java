import java.util.Scanner;

public class MSS_Brute_force {
    
    public static void max(int arr[]){

        int currSum ;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){

                currSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currSum += arr[k];
                }
                System.out.println("");
                System.out.println("Sum is :"+ currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println("");
        }
        System.out.println("Max Sum = "+maxSum);
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
