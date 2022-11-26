import java.util.Scanner;
import java.util.HashMap;

public class haypoints{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberWords = input.nextInt();
        int numJobDescriptions = input.nextInt();
        input.nextLine();
        HashMap<String,Integer> wordValue = new HashMap<>();
        for(int i=0; i<numberWords; i++){
            String word = input.next();
            int value = input.nextInt();
            wordValue.put(word, value);
        }
        for(int i=0; i<numJobDescriptions; i++){
            int valueSum = 0;
            String word = "";
            while(!word.equals(".")){
                word = input.next();
                if(wordValue.containsKey(word)){
                    valueSum+=wordValue.get(word);
                }
            }
            System.out.println(valueSum);
        }
    }
}