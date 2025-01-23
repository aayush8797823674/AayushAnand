import java.util.*;
public class Largest_of_three {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Input first number:");
            int A = sc.nextInt();
            System.out.print("Input Second number:");
            int B = sc.nextInt();
            System.out.print("Input third number:");
            int C = sc.nextInt();

            if(A>B && A>C){
                System.out.print("'A' is largest");
            }
            else if(B>A && B>C){
                System.out.print("'B' is largest");
            }
            else if(C>A && C>B){
                System.out.print("'C' is largest");
            }
            else {
                System.out.print("Numbers are Equal");
            }
        }
    }
}

