public class Recursive2 {
    public int summation(int n, int m){
        if(n==0){
            return 0;
        }
       else if(m==0){
            return n;
        }
        else if(n==1){
            return 1;
        }
        else if(m==1){
            return n + summation(n-1, m);

        }
       else if(n>1&&m>1){
            return summation(n-1,m) + summation(n,m-1);
        }
        return 0;
    }
}
