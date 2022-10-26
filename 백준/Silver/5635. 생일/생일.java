import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int Ymin = Integer.MAX_VALUE;
        int Ymax = Integer.MIN_VALUE;
        int Mmin = Integer.MAX_VALUE;
        int Mmax = Integer.MIN_VALUE;
        int Dmin = Integer.MAX_VALUE;
        int Dmax = Integer.MIN_VALUE;

        String maxRet = "";
        String minRet = "";
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //나이가 많은 사람을 구하는 로직
            if (y < Ymin) {
                Ymin = y;
                Mmin = m;
                Dmin = d;
                minRet = name;
            } else if (y == Ymin) {
                if (m < Mmin) {
                    Ymin = y;
                    Mmin = m;
                    Dmin = d;
                    minRet = name;
                } else if (m == Mmin) {
                    if (d < Dmin) {
                        Ymin = y;
                        Mmin = m;
                        Dmin = d;
                        minRet = name;
                    }
                }
            }

            if (y > Ymax) {
                Ymax = y;
                Mmax = m;
                Dmax = d;
                maxRet = name;
            } else if (y == Ymax) {
                if (m > Mmax) {
                    Ymax = y;
                    Mmax = m;
                    Dmax = d;
                    maxRet = name;
                } else if (m == Mmax) {
                    if (d > Dmax) {
                        Ymax = y;
                        Mmax = m;
                        Dmax = d;
                        maxRet = name;
                    }
                }
            }
        }
        System.out.println(maxRet);
        System.out.println(minRet);
    }
}