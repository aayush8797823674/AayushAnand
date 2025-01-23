
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number:");
            int X = sc.nextInt();

            if(X%2 == 0){
                System.out.println("Number is Even.");
            }
            else{
                System.out.println("Number is Odd.");
            }
        }
    }
}
