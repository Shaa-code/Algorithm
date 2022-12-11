import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, max = 0;
        for(int i = 0 ; i < 4 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            sum -= out;
            sum += in;
            max = Math.max(sum, max);
        }

        if (max > 10000){
            max = 10000;
        }

        System.out.println(max);

    }
}