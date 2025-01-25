import java.util.*;

public class Function_parameter {

    public static int product(int a, int b){
        int p2 = a*b;
        return p2;
    }
    public static int product(int a, int b, int c){
        int p1 = a*b*c;
        return p1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter 1st Number:");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number:");
            int b = sc.nextInt();
            System.out.print("Enter 3rd Number:");
            int c = sc.nextInt();
            
            System.out.println(product(a, b));
            System.out.println(product(a, b, c));
        }
    }
}
