import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m ; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        solution(a, b, n, m);
    }

    static void solution(int[] a, int[] b, int n,int m){
        int p1 = 0, p2 = 0;
        Set<Integer> set = new TreeSet<>();

        Arrays.sort(a);
        Arrays.sort(b);

        while(p1 < n && p2 < m) {
            if (a[p1] == b[p2]){
                set.add(a[p1]);
                p1++;
                p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}