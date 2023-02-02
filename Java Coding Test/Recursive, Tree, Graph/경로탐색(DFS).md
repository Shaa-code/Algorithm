### 내가 푼 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] g = new int[n+1][n+1];
        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            g[row][col] = 1;
        }
        int[] ch = new int[n+1];
        Main T = new Main();
        T.dfs(n,g,ch,1);
    }

    public String dfs(int n , int[][] g, int[] ch, int next){
        for(int i = next ; i <= n ; i++){
            ch[next] = 1;
            for(int j = 1 ; j <= n ; j++){
                if(g[i][j] == 1 && ch[j] == 0){
                    dfs(n,g,ch,j);
                }
            }
            if(next == n){
                String str = "";
                for(int k = 1 ; k <= n ; k++){
                    if(ch[k] == 1) str += k+" ";
                }
                System.out.println(str);
            }
            ch[next] = 0;
        }
        return "NO";
    }
}
```

끝내 못 구했다. 첫번째 경우만 찾아낼수 있는 코드이다.

### 잘하는 사람이 푼 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int n,m,ret = 0;
    static int[] ch;
    static int[][] g;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        g = new int[n+1][n+1];
        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            g[row][col] = 1;
        }
        ch = new int[n+1];
//        ch[1]=1;
        Main T = new Main();
        T.dfs(1);
        System.out.println(ret);
    }

    public void dfs(int v){
        if(next == n){
            ret++;
            String str = "";
            for(int k = 1 ; k <= n ; k++){
                if(ch[k] == 1) str += k+" ";
            }
            System.out.println(str);
        }else {
            for(int i = 1 ; i <= n ; i++) {
                if(g[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
```

![Untitled](https://user-images.githubusercontent.com/70310271/216356302-294bba12-6b7f-47e1-bc68-f0dcb104824a.png)

### 배운점

1. 우선에 DFS의 틀을 맞추자.

```java
if(종료조건){
   ...
}else{
   ...
}
```

1. DFS를 탐색할때, 2중 for문을 만들필요가 없다.

```java
for(int i = 1 ; i <= n ; i++) {
    if(g[v][i] == 1 && ch[i] == 0){
        ch[i] = 1;
        dfs(i);
        ch[i] = 0;
    }
}
```

g[1][i]일때, dfs(i)로 계속 노드를 타고 들어가도록 만들면된다.

1. 이전의 이진트리와 다르게 시작전에 ch[1] = 1로 설정하고 시작해야한다.

이진트리에서는 사용할지 말지를 결정하는것 이므로 ch[1] = 1 이후 ch[0] = 1을 사용해 준다.

ex) 1 - 2 - 3 - 4 OR 2 - 3 - 4 와 같이, 1을 완전히 사용하지 않는 경우를 생각하는것이다.

하지만 그래프의 경우에 1을 완전히 사용하지 않는것이 아니라, for문으로 반복을 돌면서 계속해서 사용하기 때문에 1을 미리 설정해두는것이다.

![Untitled 1](https://user-images.githubusercontent.com/70310271/216356381-cb943c5c-19c8-4e48-bfec-e46b7c4eb2c1.png)
