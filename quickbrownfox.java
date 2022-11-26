import java.util.Scanner;

public class quickbrownfox{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numLines = input.nextInt();
        while(input.hasNextLine()){
            int[] alphabet = new int[26];
            String line = input.nextLine();
            while(line.equals("")) line = input.nextLine();
            for(int j = 0; j < line.length(); j++){
                //UPPER CASE ALPHABET LETTER
                if(line.charAt(j) >= 65 && line.charAt(j) <= 90){
                    alphabet[line.charAt(j) - 65] = 1;
                }
                //LOWER CASE ALPHABET LETTER
                else if(line.charAt(j) >= 97 && line.charAt(j) <= 122){
                    alphabet[line.charAt(j) - 97] = 1;
                }
            }
            boolean pangram = true;
            for(int j = 0; j < 26; j++){
                if(alphabet[j] == 0) pangram = false;
            }
            if(pangram){
                System.out.println("pangram");
            }
            else{
                System.out.print("missing ");
                for(int j = 0; j < 26; j++){
                    if(alphabet[j] == 0) System.out.print((char)(j+97));
                }
                System.out.println("");
            }
        }
    }
}