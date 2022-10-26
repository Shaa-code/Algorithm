import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int sq = 1;
        boolean flag = false;
        int sum = 0;
        for(int i = 1; sq <= n; i++) {
            sq = i * i;
            if(m <= sq && sq <= n){
                flag = true;
                if( min > sq ){
                    min = sq;
                }
                sum += sq;
            }
        }
        if(flag == false) {
            System.out.println("-1");
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}