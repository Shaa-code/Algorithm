import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        ArrayList arr = new ArrayList();

        for(int i = 0; i < n ; i++){
            arr.add(i+1);
        }

        sb.append("<");

        int idx = k-1;
        while(arr.size() != 0){
            if(idx >= arr.size()){
                idx %= arr.size();
            }
            sb.append(arr.get(idx) + ", ");
            arr.remove(idx);
            idx += k-1;
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}