import java.util.*;

class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        T.solution(str);
    }

    public String solution(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i) +" "+ i +" "+ str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) ret += str.charAt(i);
        }
        return ret;
    }
}
