
import java.util.Scanner;

public class cf4_236A_BoyorGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        int size =userName.length();

        if(size%2==1){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

  
    }
}