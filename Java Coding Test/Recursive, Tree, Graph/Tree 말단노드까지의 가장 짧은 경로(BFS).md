### 내가 푼 코드

```java
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.bfs(0,root));

    }

    public int bfs(int L, Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0 ; i < len ; i++) {
                Node tmp = q.poll();
                if (tmp.lt != null) q.offer(tmp.lt);
                if (tmp.rt != null) q.offer(tmp.rt);
                if (tmp.lt == null && tmp.rt == null) return L;
            }
            L++;
        }
        return -1;
    }
}

class Node{
    int data;
    Node lt, rt;

    Node(int data){
        this.data = data;
        this.lt = this.rt = null;
    }
}
```
