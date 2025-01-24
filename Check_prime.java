import java.util.*;

public class Check_prime {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            boolean isPrime = true;
            for(int i =2 ; i< n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }

            if(n==1){
                System.out.println("Neither a prime number nor a composite number");
            }
            else if(isPrime == true){
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        }
    }
}
