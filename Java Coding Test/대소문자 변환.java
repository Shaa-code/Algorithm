import java.util.*;

class CodeTest1 {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

class Main{
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            //if(Character.isUpperCase(x))
            if(x >= 97 && x <= 122)
                answer += (char)(x-32);//Character.toLowerCase(x);
            else
                answer += (char)(x+32); //Character.toUpperCase(x);
        }
        return answer;
    }
}
