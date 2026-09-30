import java.util.Scanner;
public class cf_16A_Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            {
            int sum  =0;

            for (int j = 0; j < m; j++) 
            {
             arr[i][j]=sc.nextInt();
             sum+=arr[i][j];
            }
            if((arr[i][0])*m==sum)
                {
                
                break;
                }
                sum=0;
            }
               
        }
        
    }
