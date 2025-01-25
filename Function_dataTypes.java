import java.util.*;

public class Function_dataTypes {

    public static int product(int a, int b){
        int p2 = a*b;
        return p2;
    }
    public static float product(float a, float b){
        float p1 = a*b;
        return p1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter 1st Number:");
            float a = sc.nextFloat();
            System.out.print("Enter 2nd Number:");
            float b = sc.nextFloat();
    
            System.out.println(product(a, b));
        }
    }
}