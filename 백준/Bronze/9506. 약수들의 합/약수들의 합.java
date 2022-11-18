import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            sb.append(n + " = ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) { // 1 2 3 4 6 12
                    sum += i; // 1 2 3 4 6
                    sb.append(i + " + ");
                }
            }
            if(sum == n){
                System.out.println(sb.delete(sb.length() - 3, sb.length()));
            }else if(n == -1){
                break;
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
