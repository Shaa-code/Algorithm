import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        while(i < 9){
            int m = Integer.parseInt(br.readLine());
            n -= m;
            i++;
        }
        System.out.println(n);
    }
}