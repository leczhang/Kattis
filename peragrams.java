import java.util.Scanner;
public class peragrams{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        //index 0 holds a, index 25 holds z
        int[] charCount = new int[26];
        for(int i=0;i<input.length();i++){
            charCount[(int)input.charAt(i)-(int)'a']++;
        }
        int oddCount = 0;
        for(int i=0;i<26;i++){
            if(charCount[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount == 0){
            System.out.println(oddCount);
        }
        else{
            System.out.println(oddCount-1);
        }
    }
}