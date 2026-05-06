package RecursionM;

// Q) Print all unique subsequences of the string

import java.util.*;

public class PrintUniqSubsequences {

    public static void subsequences(String str,int idx,String newStr,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newStr+currChar, set);
        // not to be
        subsequences(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
// aaa
// aa
// a
// 
