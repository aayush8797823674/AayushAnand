import java.util.*;
public class Pass_Fail {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Marks:");
            int Marks = sc.nextInt();

            if(Marks >= 33 && Marks <= 100){
                System.out.println("Pass.");
            }
            else if(Marks < 33){
                System.out.println("Fail.");
            }
            else{
                System.out.println("Not Valid!");
            }
        }
    }
}
