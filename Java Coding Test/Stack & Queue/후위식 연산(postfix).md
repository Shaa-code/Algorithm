### 내가 짠 코드

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Stack s = new Stack();
        for(char x : str){
            if(!Character.isDigit(x)){
                int post = 0;
                int pre = 0;
                switch(x){
                    case '+':
                        post = Integer.parseInt(String.valueOf(s.pop()));
                        pre = Integer.parseInt(String.valueOf(s.pop()));
                        s.push(pre + post);
                        break;
                    case '-':
                        post = Integer.parseInt(String.valueOf(s.pop()));
                        pre = Integer.parseInt(String.valueOf(s.pop()));
                        s.push(pre - post);
                        break;
                    case '*':
                        post = Integer.parseInt(String.valueOf(s.pop()));
                        pre = Integer.parseInt(String.valueOf(s.pop()));
                        s.push(pre * post);
                        break;
                    case '/':
                        post = Integer.parseInt(String.valueOf(s.pop()));
                        pre = Integer.parseInt(String.valueOf(s.pop()));
                        s.push(pre / post);
                        break;
                }
            }else s.push(x);
        }
        System.out.println(s.pop());
    }
}
```

### 배운점

1. 반복되는 코드는 앞으로 뺄 수 있다. pre,post를, case문안에서 초기화하는건 잘못되었다.
2. swtich문은 break문을 매번 적어줘야하므로 코드가 길어진다. 하지만, if,else도 x==을 반복해서 적어줘서 큰 차이는 없다. 아무꺼나 쓰도록하자
3. String.valueOf()를 쓰던지, (char)x-48을 쓰던지 간에, 여러번 적으면 낭비된다.
어차피 계산 되는것이면 처음 한번만 처리되도록 만들자. s.push(x-48)
4. Stack에 제네릭으로 타입을 아무것도 넣지않으면, s.pop()을할때 (반환값은 E임) Object를 반환한다. 이때, int val = s.pop()을 하면 오류가 발생한다.

### 개선한 코드

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Stack<Integer> s = new Stack();
        for(char x : str){
            if(!Character.isDigit(x)){
                int post = s.pop();
                int pre = s.pop();
                switch(x){
                    case '+': s.push(pre + post); break;
                    case '-': s.push(pre - post); break;
                    case '*': s.push(pre * post); break;
                    case '/': s.push(pre / post); break;
                }
            }else s.push(x-48);
        }
        System.out.println(s.pop());
    }
}
```
