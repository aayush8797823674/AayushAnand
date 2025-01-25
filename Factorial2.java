import java.util.Scanner;

public class Factorial2 {
    public static int factorial(int n){
        int fact = 1;
            for(int i = 1; i <= n ; i++){
                fact *= i;
            }
        return fact;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            
            System.out.println("The Factorial is : " + factorial(n));
        }
    }
}
