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
        for(int x : T.solution(n,arr)) {
            System.out.println(x);
        }
    }

    public int[] solution(int n , int[] arr) {
        for(int i = 1 ; i < n ; i++){
            int tmp = arr[i];
            for(int j = i-1 ; j >= 0 ; j--){
                if(tmp < arr[j]){
                    arr[j+1] = arr[j];
                }else if(arr[j] == arr[j+1]){
                    arr[j] = tmp;
                }
            }
            if(arr[0] == arr[1]){
                arr[0] = tmp;
            }
        }
        return arr;
    }
}
```

못 풀었다. 

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
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){ arr[i] = Integer.parseInt(st.nextToken());}
        for(int x : T.solution(n,arr)) {
            System.out.println(x);
        }
    }

    public int[] solution(int n , int[] arr) {
        for(int i = 1 ; i < n ; i++){
            int tmp = arr[i], j;
            for(j = i-1 ; j >= 0 ; j--){
                if(tmp < arr[j]) arr[j + 1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
}
```

### 배운점

1. j는 지역 변수이므로 소멸되서 사용할 수 없었다.

그래서 어떻게 표현해 내야할지 고민을 엄청 많이하다가 결국 답을 못냈다.

하지만, j라는 변수를 이전에 선언해줌으로써 for문이 끝나더라도 사용할 수 있도록 만들 수 있다는점을 배웠다.

2. 증감식이 break를 만나면 어떻게 작동하는지 정확히 모르고 있었다.

![image](https://user-images.githubusercontent.com/70310271/209477522-a835a084-8457-4f91-8578-0fc987f6e907.png)

break를 만나면, 증감식이 작동되지 않고 반복문을 탈출한다.
