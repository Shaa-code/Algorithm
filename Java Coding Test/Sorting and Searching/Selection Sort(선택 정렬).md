### 내가 푼 코드

```
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

    public int[] solution(int n , int[] arr){
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
```

### 잘하는 사람이 쓴 코드

```
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

    public int[] solution(int n , int[] arr){
        for(int i = 0 ; i < n-1 ; i++){
            int idx = i;
            for(int j = i+1 ; j < n ; j++) {
                if(arr[i] < arr[idx]) idx = j;
            }
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
        }
        return arr;
    }
}
// 13 5 11 7 23 15
```

### 배운점

1. 굳이 idx를 써줘야하나?

swap연산이 계속 일어나므로, 속도가 저하된다. 꼭 쓰도록하자.

1. swap까지 함수로 빼면 좋을것같아 빼주었다.

### 개선한 코드

```
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

    public int[] solution(int n , int[] arr){
        for(int i = 0 ; i < n-1 ; i++){
            int idx = i;
            for(int j = i+1 ; j < n ; j++) {
                if(arr[i] < arr[idx]) idx = j;
            }
            swap(arr,i,idx);
        }
        return arr;
    }

    public void swap(int[] arr, int i , int j) {
        int tmp = arr[i];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}

//2 5 5 5
```

- 선택정렬의 장점

자료의 이동횟수가 미리 정해진다.

역순 정렬, 즉, 내림차순으로 재정렬할 때 최적의 효율을 보여준다.

- 선택정렬의 단점

이미 정렬된 상태에서 조금의 자료들이 추가되었을 때에 최악의 처리속도를 보여준다.

![img](https://user-images.githubusercontent.com/70310271/209177377-137dd8bc-3eef-4c84-b07e-c661972c6cff.gif)
