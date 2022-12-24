버블 정렬은 한번 순회할때마다, 제일 큰수가 가장 뒤로 가는 알고리즘이다.

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
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){ arr[i] = Integer.parseInt(st.nextToken());}
        for(int x : T.solution(n,arr)) System.out.print(x + " ");
    }

    public int[] solution(int n , int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
```

### 잘하는 사람이 쓴 코드

완전히 똑같아서 생략한다.

### 배운점

1. “n-1-i” 라는 수를 생각보다 발상해내기 어려웠다.

![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ee0cbce2-8e92-46e5-9590-d9930d55705b/img.gif)
