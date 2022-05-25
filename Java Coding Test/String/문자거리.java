class Main{
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str,c)){
            System.out.printf(x + " ");
        }
    }

    public int[] solution(String s,char t) {
        int[] ret = new int[s.length()];
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)==t) {
                cnt = 0;
                ret[i] = cnt;
            } else{
                cnt += 1;
                ret[i] = cnt;
            }
        }
        cnt = 0;
        for(int i = s.length()-1 ; i >= 0 ; i--)
            if(s.charAt(i)==t) {
                cnt = 0;
            }else {
                cnt += 1;
                if(ret[i]>cnt) ret[i]=cnt;
            }
        return ret;
    }
}
