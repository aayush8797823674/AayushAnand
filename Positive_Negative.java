import java.util.*;
public class Positive_Negative {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number:");
            int X = sc.nextInt();

            if(X>=0){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}