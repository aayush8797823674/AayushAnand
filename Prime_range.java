import java.util.Scanner;

public class Prime_range {

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

    public static void rangePrime(int n){
        for(int i=2; i<n; i++){
            if(prime(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            rangePrime(n);
        }
    }
}
