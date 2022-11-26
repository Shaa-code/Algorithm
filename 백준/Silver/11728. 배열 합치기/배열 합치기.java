import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] lst1 = new int[n];
        int[] lst2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < n ; i++){
            lst1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            lst2[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m) {
            if (lst1[p1] < lst2[p2])
                sb.append(lst1[p1++] + " ");
            else
                sb.append(lst2[p2++] + " ");
        }
        while(p1 < n)
            sb.append(lst1[p1++] + " ");
        while(p2 < m)
            sb.append(lst2[p2++] + " ");
        System.out.println(sb);
    }
}