public class Recursive2 {
    public int summation(int n, int m){
        int sum = 0;
        if(n==1){
            return sum+1;
        }
        else if(m==1){
            sum = n + summation(n-1, m);
            return sum;
        }
       else if(n>1&&m>1){
            sum = summation(n,m) + summation(n,m-1);
            return sum;
        }
        return sum;
    }
}
