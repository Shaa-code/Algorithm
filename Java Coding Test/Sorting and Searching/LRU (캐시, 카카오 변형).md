### 내가 푼 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : T.solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int s, int n , int[] arr) {
        int[] c = new int[s];
        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < s; i++){
                if(x == c[i]){
                    pos = i;
                }
            }//Miss
            if(pos == -1){
                for(int i = 1 ; i < s; i++){
                    c[i] = c[i-1];
                }
                c[0] = x;
            }else{//Hit
                int cnt = 0;
                while(cnt < pos) {
                    int i = 1;
                    c[i] = c[i - 1];
                    i++;
                    cnt++;
                }
                c[0] = arr[pos];
            }
        }
        return c;
    }
}
```

못 풀겠어서 해설을 보며 조금씩 풀었는데, 여전히 못풀었다.

### 잘 푼 사람의 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : T.solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int s, int n , int[] arr) {
        int[] c = new int[s];
        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < s; i++){
                if(x == c[i]){
                    pos = i;
                }
            }
            if(pos == -1){ // Miss
                for(int i = s-1 ; i >= 1; i--){
                    c[i] = c[i-1];
                }
                c[0] = x;
            }else{ // Hit
                for(int i = pos; i >= 1 ; i--){
                    c[i] = c[i-1];
                }
                c[0] = x;
            }
        }
        return c;
    }
}
```

### 배운점

1. 값을 포함하고 있는 index 그리고 못 찾았을때를 동시에 처리해야 할때 필요한 알고리즘

```
for(int x : arr){
int pos = -1;
for(int i = 0; i < s; i++) {
    if(x == c[i]){
        pos = i;
        break;
    }
}
```

이 아이디어를 발상해내는것 자체가 고난이도였다.

2. 배열에서 앞의 인덱스를 뒤의 인덱스에 넣어줄때, 증가하면서 교체하는것은 잘못된 생각이었다.

```java
for(int i = 1 ; i < s; i++){
    c[i] = c[i-1];
}
```

ex) 3 2 1 일때를 가정해보면 3, 3, 3, 3, 3으로 채워진다.

뒤에서 부터 시작해야한다.

### 최종 개선 코드

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : T.solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int s, int n , int[] arr) {
        int[] c = new int[s];
        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < s; i++) {
                if(x == c[i]){
                    pos = i;
                    break;
                }
            }
            if(pos == -1){
                for(int i = s-1 ; i > 0; i--) {
                    c[i] = c[i-1];
                }
            }else {
                for (int i = pos; i > 0; i--) {
                    c[i] = c[i - 1];
                }
            }
            c[0] = x;
        }
        return c;
    }
}

```

1. 탐색이 끝났으면 굳이 더 계산 안해도 되므로 break 넣어줌.
2. c[0] = x 는 한번만 작동해도되므로 뒤로 뺴줌.
