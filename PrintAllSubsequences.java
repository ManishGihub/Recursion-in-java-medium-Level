package RecursionM;

// Q) Print all subsequences of a string 
public class PrintAllSubsequences {
    public static void subSeq(String str, int idx,String subStr){
        if(idx == str.length()){
            System.out.println(subStr);
            return;
        }
        char curChar = str.charAt(idx);
        //to be
        subSeq(str, idx+1, subStr+curChar);
        //not to be
        subSeq(str, idx+1, subStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}
// abc
// ab
// ac
// a
// bc
// b
// c
// 