import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ret = 0;
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        while(n-- > 0){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == b && b == c && a == c) {
                ret = 10000 + a * 1000;
            } else if (a == b){
                ret = 1000 + a * 100;
            } else if (b == c){
                ret = 1000 + b * 100;
            } else if (c == a){
                ret = 1000 + c * 100;
            } else{
                int greatest = Math.max(a,Math.max(b,c));
                ret = greatest * 100;
            }

            if (max < ret){
                max = ret;
            }

        }
        System.out.println(max);
    }
}
