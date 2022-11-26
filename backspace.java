import java.util.Stack;
import java.util.Scanner;

public class backspace{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.next();
        Stack<Character> list = new Stack<Character>();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '<'){
                list.pop();
            }
            else{
                list.push(line.charAt(i));
            }
        }
        System.out.print(list.toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(", ",""));
    }
}