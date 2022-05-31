import java.util.*;
class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int h = kb.nextInt();
        int m = kb.nextInt();
        T.solution(h, m);
    }

    public void solution(int h, int m){
        //10 10이 들어왔을때, 9 25를 출력
        //우선에 M를 먼저 조작 해야함, 왜냐하면 M에 따라 H가 달라지기 때문임.
        if(m < 45){
            h--;
            m = m+60-45;
            if(h<0) h = 23;
            System.out.print(h +" "+ m);
        }else{
            System.out.println(h + " " + (m-45)); //조건 외에 내용을 호출하는것도 써줘야함.
        }

    }
}
