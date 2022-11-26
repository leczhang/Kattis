import java.util.ArrayList;
import java.util.Scanner;

public class doorman{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        String line = input.next();
        int men = 0;
        int women = 0;
        
        //turn line into an ArrayList and populate new AL
        ArrayList<Character> queue = new ArrayList<Character>();
        for(int i = 0; i < line.length(); i++){
            queue.add(line.charAt(i));
        }
        
        //iterate through new AL
        while(!queue.isEmpty()){
            char firstInLine = queue.get(0);
            
            //handle the cases where a man is first in line
            if(firstInLine == 'M' && (men - women) < X){
                men++;
                queue.remove(0);
            }
            else if(firstInLine == 'M' && (men - women) == X){
                if(queue.get(1) == 'W'){
                    women++;
                    queue.remove(1);
                    continue;
                }
                else{
                    break;
                }
            }
            //handle the cases where a woman is first in line
            else if(firstInLine == 'W' && (women - men) < X){
                women++;
                queue.remove(0);
            }
            else if(firstInLine == 'W' && (women - men) == X){
                if(queue.get(1) == 'M'){
                    men++;
                    queue.remove(1);
                    continue;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(men + women);
    }
}