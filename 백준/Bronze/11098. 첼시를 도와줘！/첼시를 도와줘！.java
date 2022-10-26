import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            String voted = "";
            for (int j = 0; j < p; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int val = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if (max < val) {
                    max = val;
                    voted = name;
                }
            }
            System.out.println(voted);
        }
    }
}