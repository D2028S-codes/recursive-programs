public class Recursive1 {


    public static void makeInt(int length, int current){
            if(length==0){
                System.out.println(current);
                return;
            }
            int lastNum  = current%10;
            for(int i = lastNum +1; i<=9;i++){
                makeInt(length-1, current*10+i);
            }

    }
    public static void starts(int length){
            makeInt(length, 0);
        }
    }

