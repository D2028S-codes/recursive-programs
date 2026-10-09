public class Recursive3 {
    public static void binStrings(int length, String string){
        if(length==0){
            string = "";
            System.out.println(string);
        }
        if(length==1){
            if(string.equals("0")){
                System.out.println("0");
            }
            else if(string.equals("1")){
                System.out.println("1");
            }
            else if(string.equals("")){
                System.out.println("0");
                System.out.println("1");
            }
        }
        if(length>1){

        }
    }
}
