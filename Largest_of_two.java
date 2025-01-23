
import java.util.*;
public class Largest_of_two {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Input first number:");
            int a = sc.nextInt();
            System.out.print("Input Second number:");
            int b = sc.nextInt();

            if(a>b){
                System.out.print("'a' is largest");
            }
            else if(b>a){
                System.out.print("'b' is largest");
            }
            else{
                System.out.println("Both are equal");
            }
        }
    }
}
