package RecursionM;

public class RemoveDuplicateFString {
    public static boolean map[] = new boolean[26];
    public static void removeDuplicate(String str,int idx,String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicate(str, idx+1, newStr);
        }else{
            newStr += str.charAt(idx);
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbccdd";
        removeDuplicate(str, 0, "");
    }
}
// abcd
