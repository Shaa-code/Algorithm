import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                q.offer(new int[] {i,Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;


            while(q.size() != 0){
                int[] tmp = q.poll();
                boolean flag = true;
                for(int[] Qtmp : q){
                    if(tmp[1] < Qtmp[1]){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    q.offer(tmp);
                }else{
                    cnt++;
                    if(tmp[0] == m){
                        System.out.println(cnt);
                    }
                }
            }
        }
    }
}