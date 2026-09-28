import java.util.Scanner;
public class cf_14A_Letter {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
    
            String[] g = new String[n];
            for (int i = 0; i < n; i++) {
                g[i] = sc.next();
            }
    
            int r1 = n, r2 = -1, c1 = m, c2 = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (g[i].charAt(j) == '*') {
                        r1 = Math.min(r1, i);
                        r2 = Math.max(r2, i);
                        c1 = Math.min(c1, j);
                        c2 = Math.max(c2, j);
                    }
                }
            }
    
            StringBuilder sb = new StringBuilder();
            for (int i = r1; i <= r2; i++) {
                sb.append(g[i], c1, c2 + 1).append('\n');
            }
            System.out.print(sb);
        }
    }


