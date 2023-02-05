### 내가 푼 코드

```java
import java.io.IOException;
import java.util.*;

class Main {
    static int n,m;
    static int[][] g;
    static int[] ch;
    static Map<Integer,Integer> hm = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new int[n+1][n+1];
        for(int i = 0 ; i < m ; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            g[row][col] = 1;
        }
        ch = new int[n+1];
        ch[1] = 1;
        T.bfs(1);
        for(Map.Entry<Integer, Integer> x: hm.entrySet()){
            System.out.println(x.getKey() + " : "+ x.getValue());
        }
    }

    public void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        int L = 0;
        q.offer(v);
        while(!q.isEmpty()){
           int len = q.size();
           L++;
           for(int i = 0 ; i < len ; i++){
               int tmp = q.poll();
               for(int j = 1 ; j <= n ; j++) {
                   if(g[tmp][j] == 1 && ch[j] == 0){
                       ch[j] = 1;
                       hm.put(j,L);
                       q.offer(j);
                   }
               }
           }
        }
    }
}
```

### 잘하는 사람이 푼 코드

```java
import java.io.IOException;
import java.util.*;

class Main {
    static int n,m;
    static ArrayList<ArrayList<Integer>> g;
    static int[] ch, dis;
    static Map<Integer,Integer> hm = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new ArrayList<>();
        for(int i = 0 ; i < n ; n++){
            g.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m ; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            g.get(row).add(col);
        }
        ch = new int[n+1];
        dis = new int[n+1];
        T.bfs(1);
        for(Map.Entry<Integer, Integer> x: hm.entrySet()){
            System.out.println(x.getKey() + " : "+ x.getValue());
        }
    }

    public void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()){
           int cv = q.poll();
           for(int nv : g.get(cv)){
               if(ch[nv]==0){
                   ch[nv]=1;
                   q.offer(nv);
                   dis[nv]=dis[cv]+1;
               }
           }
        }
    }
}
```

### 배운점

1. 인접리스트가 어차피 for문으로 모두 검색을 해야되는 입장에서는 효율이 더 좋다.
2. 난 해쉬맵을 썼지만, 잘하는 사람은 배열에 카운트를 해주는 방식을 사용했다.

둘중에 하나를 선택하는건 성능에 큰 차이가 없어보여서, 취향이 아닐까 싶다.
