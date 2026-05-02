package RecursionM;

// Q) Move all x to last of the string
public class MoveAllXToEnd {
    public static void movex(String str,int idx,int count,String newStr){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            movex(str, idx+1, count, newStr);
        }else{
            newStr += currChar;
            movex(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcdxxxe";
        movex(str, 0, 0, "");
    }
}
// abcdexxxx
