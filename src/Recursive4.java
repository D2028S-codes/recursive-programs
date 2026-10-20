public class Recursive4 {
    public static void generate(int n, String s){
        if(s.length()==n){
            if(n%2==0) {
                if (checkSumHalf(s.substring(0, n / 2)) == checkSumHalf(s.substring(n / 2))) ;
                System.out.println(s);
                return;
            }
            if(n%2==1) {
                if (checkSumHalf(s.substring(0, n / 2)) == checkSumHalf(s.substring((n / 2)+1))) ;
                System.out.println(s);
                return;
            }
          generate(n, s+"1");
            generate(n, s+"0");
            }

        }
        if()
    }
    public static int checkSumHalf(String s){

    }
}
