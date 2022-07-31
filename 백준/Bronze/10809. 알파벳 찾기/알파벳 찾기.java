import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    for(char c = 'a' ; c<= 'z'; c++)
        System.out.print(s.indexOf(c) + " ");
    }
}