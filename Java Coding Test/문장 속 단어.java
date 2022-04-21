class Main{

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String ret = "";
        String[] arr = str.split(" ");
        int min = Integer.MIN_VALUE;
        for (String x : arr) {
            int len = x.length();
            if (len > min) {
                min = len;
                ret = x;
            }
        }
        return ret;
    }
}

/*
class Main{

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String ret = "";
        int min = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > min) {
                min = len;
                ret = tmp;
            }
            str = str.substring(pos+1);
        }
        return ret;
    }
}
*/
