import static java.lang.Integer.parseInt;

public class Recursive4 {
    public static void generate(int n, String s) {
        if (s.length() == n) {
            if (n % 2 == 0) {
                if (checkSumHalf(s.substring(0, n / 2)) == checkSumHalf(s.substring(n / 2))) ;
                System.out.println(s);
                return;
            }
            if (n % 2 == 1) {
                if (checkSumHalf(s.substring(0, n / 2)) == checkSumHalf(s.substring((n / 2) + 1))) ;
                System.out.println(s);
                return;
            }
            else if(checkSumHalf(s.substring(0, n / 2)) =! checkSumHalf(s.substring((n / 2))));{
                return;
            }
        }
        generate(n, s + "1");
        generate(n, s + "0");

    }

    public static int checkSumHalf(String s) {
        int sum = 0;
        if (s.length() > 0) {
            int indexPlace = s.length() - 1;
            if (indexPlace > 0) {
                if (parseInt(s.substring(indexPlace)) == 1) {
                    sum++;
                }
                indexPlace--;
                checkSumHalf(s.substring(indexPlace - 1, indexPlace));
                return sum;
            }
        }
        return sum;
    }

}