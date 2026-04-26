package RecursionM;

public class ReverseString {
    public static void ReverseStr(String str,int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        ReverseStr(str,idx-1);
    }
    public static void main(String []args){
        String str = "abcd";
        ReverseStr(str, str.length()-1);
    }
}
