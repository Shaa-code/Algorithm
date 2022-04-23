class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }


    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> ret = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            ret.add(tmp);
        }
        return ret;
    }
    
    /*
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> ret = new ArrayList<>();
            for(String x : str) {
                char[] s = x.toCharArray();
                int lt = 0, rt = x.length() - 1;
                while (lt < rt) {
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++;
                    rt--;
                }
                String tmp = String.valueOf(s);
                ret.add(tmp);
            }
        return ret;
    }
    */
}
