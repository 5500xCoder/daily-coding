import java.util.Scanner;

public class cf5_1005B_DeleteFromLeft {

    public static int findCommonLength(String s, String t){
        int count=0;
        int minLength = Math.min(s.length(), t.length());
        for(int i=0; i<minLength; i++){
            if(s.charAt(s.length()-i-1)!=t.charAt(t.length()-i-1)){
                break;
            }
            count++;

        }
        return count;
    }


public static int calculate(String s, String t){
    int commonLength= findCommonLength(s,t);
    return s.length() + t.length() - 2 * commonLength;
}

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int result=calculate (s,t);
        System.out.println(result);
    }
}


// In the first example, you should apply the move once to the first string and apply the move once to the second string. As a result, both strings will be equal to "est".

// In the second example, the move should be applied to the string "codeforces" 8
//  times. As a result, the string becomes "codeforces" →
//  "es". The move should be applied to the string "yes" once. The result is the same string "yes" →
//  "es".

// In the third example, you can make the strings equal only by completely deleting them. That is, in the end, both strings will be empty.

// In the fourth example, the first character of the second string should be deleted.


