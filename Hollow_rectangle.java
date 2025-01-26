import java.util.*;

public class Hollow_rectangle{

    public static void hollow_rect(int r, int c){

        for(int i = 0; i<r ; i++){
            for(int j= 0; j<c ; j++){
                if(i == 0 || i == r-1){
                    System.out.print("*");
                }
                else if(j == 0 || j == c-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Row : ");
            int r = sc.nextInt();
            System.out.print("Enter Column : ");
            int c = sc.nextInt();

            
            hollow_rect(r , c);
        }
    }
}