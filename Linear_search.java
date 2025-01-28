import java.util.Scanner;

public class Linear_search {
    
    public static int linear_search(int arr[], int search){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
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

            System.out.print("Enter the number to search : ");
            int search = sc.nextInt();
            int ans = linear_search(arr,search);

            if(ans == -1){
                System.out.println("Not Found");
            }
            else{
                System.out.println("Found at index "+ ans);
            }
        }
    }
}
