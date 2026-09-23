package CodeForce;
import java.util.*;

class cf3_231A_Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int f1= scanner.nextInt();
            int f2 = scanner.nextInt();
            int f3 = scanner.nextInt();
            if (f1 + f2 +f3>= 2) {
                count++;
            } 
            
        }
        System.out.println(count);
        
    }
}