### 내가 푼 코드
```java
import java.io.IOException;
class Main {

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(T.dfs(0,root));

    }

    public int dfs(int L, Node root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(dfs(L+1,root.lt),dfs(L+1, root.rt));
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

![image](https://user-images.githubusercontent.com/70310271/215716333-db61107f-a899-403a-b15d-507f508e45a0.png)

### 배운점

1. DFS로도 리프노드 까지의 최단거리를 알아 낼 수 있다.
2. Full Binary Tree일때만 가능하다는 한계가 있다.
