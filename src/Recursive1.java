public class Recursive1 {
    public static int nextInt(int length, int current){
            newNum+= ((int) (Math.random()*10));
            while((newNum+"").length()<length){
                for(int putNum =(newNum%10)+1; putNum<=9; putNum++){
                    if(newNum==0){
                        newNum+=putNum;
                    }

                }
            }
            return newNum;
    }
    public static int makesInts(int length){
        int current = 0;
        while((current+"").length()<length){
            nextInt(length,current);
        }
    }
}
