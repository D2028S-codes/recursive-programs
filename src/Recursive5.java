public class Recursive5 {
    public static int helper(int total, int wrappers, int wrap){
        if(wrappers<wrap){
            return total;
        }
        int extra= wrappers/wrap;
        return helper(total+extra, wrappers%wrap + extra, wrap);

    }
    public static int chocolate(int money, int price, int wrap){
       return helper(money/price, money/price, wrap);
    }
    public static void main(String[]args){
        System.out.println(chocolate(30,5,2));
    }
}
