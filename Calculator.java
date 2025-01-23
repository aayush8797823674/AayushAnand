import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter A:");
            int A = sc.nextInt();
            System.out.print("Enter B:");
            int B = sc.nextInt();

            System.out.print("Enter Operator:");
            char operator = sc.next().charAt(0);

            switch(operator){

                case '+' -> System.out.print(A+B);
                case '-' -> System.out.print(A-B);
                case '*' -> System.out.print(A*B);
                case '/' -> System.out.print(A/B);
                case '%' -> System.out.print(A%B);
                default -> System.out.println("wrong operator");
            }
        }
    }
}
