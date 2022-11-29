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
//내 방식은 인덱스를 슬라이딩 시키는 방식이었다.
//이 방식은, 배열의 범위가 벗어나는것을 제어해주어야 하므로, 코드가 늘어난다.
//훨씬 깔끔하게 처리할 수 있는 방법이있다.

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

        int sum = 0;
        for(int i = 0; i < m ; i++){
            sum += arr[i];
        }

        int max = 0;
        for(int i = m; i < arr.length ; i++) {
            sum += (arr[i] - arr[i-m]);
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}

//즉, 슬라이딩 윈도우는 내가 위에서 한것처럼 해도 되긴하지만, sum += arr[i]을 각 원소의 갯수 만큼 반복해서 더해주면 느리다.
//그냥 맨 앞에값을 빼주고, 맨 뒤값을 더해주면 끝이다.
