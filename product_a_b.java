import java.util.*;

public class product_a_b {

    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter 1st Number:");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number:");
            int b = sc.nextInt();
            
            System.out.println("The product is : " + product(a, b));
        }
    }
}
