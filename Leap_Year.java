import java.util.*;

public class Leap_Year {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Year:");
            int Year = sc.nextInt();

            if(Year % 4 == 0){
                if(Year % 100 != 0 || Year % 400 == 0){
                    System.out.println("Leap Year.");
                }
                else{
                    System.out.println("Not a Leap Year.");
                }
            }
            else{
                System.out.println("Not a Leap Year.");
            }
        }
    }
}
