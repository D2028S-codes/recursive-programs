public class Recursive3 {
    public static void binStrings(int length, String string){
        if(length == string.length()){
            System.out.println(string);
            return;
        }
            binStrings(length, string+"0");
        if((string.length()==0)||(string.substring(string.length()-1).equals("0")))
        {
            binStrings(length, string+"1");
        }
        }
    }

