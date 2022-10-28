import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        switch(br.readLine()){
            case "*":
                System.out.println(n.multiply(new BigInteger(br.readLine())));
                break;
            case "+":
                System.out.println(n.add(new BigInteger(br.readLine())));
                break;
        }
    }
}