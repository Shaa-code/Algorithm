import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int j = 0; j < t; j++) {
            int cntY = 0;
            int cntK = 0;
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                cntY += y;
                cntK += k;
            }

            if (cntY > cntK) {
                System.out.println("Yonsei");
            } else if (cntY < cntK) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}