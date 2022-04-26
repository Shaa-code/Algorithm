import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str){
        //String tmp = new StringBuilder(str).reverse().toString();
        //if(str.equalsIgnoreCase(tmp)) return "YES";
        str = str.toLowerCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return "YES";
    }
}
