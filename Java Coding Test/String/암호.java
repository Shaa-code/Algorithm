class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }

    public String solution(int n, String str) {
        String ret = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            tmp = tmp.replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmp,2);
            ret += (char)num;
            str=str.substring(7);
        }
        return ret;
    }
}
