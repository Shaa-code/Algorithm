import java.util.*;

class Main{
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

public String solution(String str){
    String ret = "";
    str = str + " ";
    int cnt = 1;
    for(int i = 0 ; i < str.length()-1 ; i++){
        if(str.charAt(i) == str.charAt(i+1)) { //어떻게 비교하는가? i == i+1;로 비교한다.
            cnt++;
        }else{
            if(cnt == 1){
                ret += str.charAt(i);
            }else{
                ret += str.charAt(i) + String.valueOf(cnt);
            };
            /*
            ret += str.charAt(i);
            if(cnt > 1) ret += String.valueOf(cnt);
            */
            cnt = 1;
            }
        }
    return ret;
    }
}
