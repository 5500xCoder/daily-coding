
import java.util.Scanner;

public class cf_22A_SecondOrderStatistics {

    public static String secondSmallest(int [] arr){
        int min =Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
            }

            
        }
        if (secondMin == Integer.MAX_VALUE) {
            return "NO";
        }
    
        return String.valueOf(secondMin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(secondSmallest(arr));
       
    }
}
