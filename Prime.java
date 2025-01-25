import java.util.Scanner;

public class Prime {

    public static Boolean prime(int n){

        if(n==2){
            return true;
        }

        for(int i =2 ; i< n-1; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            boolean ans = prime(n);
            if(ans == true){
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is Not Prime");
            }
        }
    }
}
