import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int p1 = 0;
        while(true){
            int p2 = p1+m;
            if(p2 == arr.length+1)
                break;
            int sum = 0;
            for(int i = p1; i < p2; i++){
                sum += arr[i];
            }
            p1++;
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
