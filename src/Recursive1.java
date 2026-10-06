public class Recursive1 {
    public int nextInt(int length, ){
        int newNum=0;
            newNum+= ((int) (Math.random()*10));
            while((newNum+"").length()<length){
                for(int putNum =(newNum%10)+1; putNum<=9; putNum++){
                    if(newNum==0){
                        newNum+=putNum;
                    }

                }
            }

    }
}
