import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int val = kb.nextInt() * kb.nextInt() * kb.nextInt();
       String str = ""+val;

       for(int i = 0 ; i < 10 ; i++){
           int cnt = 0;
           for(int j = 0 ; j < str.length() ; j++){
               if((str.charAt(j)-'0') == i){
                   cnt++;
               }
           }
           System.out.println(cnt);
       }
    }
}