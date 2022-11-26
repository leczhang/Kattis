import java.util.Scanner;

public class anewalphabet{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String out = "";
        for(int i = 0; i < in.length(); i++){
            char nextChar = in.charAt(i);
            if(!Character.isLowerCase(nextChar) && !Character.isUpperCase(nextChar)){
                out += nextChar;
                continue;
            }
            if(nextChar >= 65 && nextChar <= 90){
                nextChar = Character.toLowerCase(nextChar);
            }
            switch(nextChar){
                case 'a':
                    out += "@";
                    break;
                case 'b':
                    out += "8";
                    break;
                case 'c':
                    out += "(";
                    break;
                case 'd':
                    out += "|)";
                    break;
                case 'e':
                    out += "3";
                    break;
                case 'f':
                    out += "#";
                    break;
                case 'g':
                    out += "6";
                    break;
                case 'h':
                    out += "[-]";
                    break;
                case 'i':
                    out += "|";
                    break;
                case 'j':
                    out += "_|";
                    break;
                case 'k':
                    out += "|<";
                    break;
                case 'l':
                    out += "1";
                    break;
                case 'm':
                    out += "[]\\/[]";
                    break;
                case 'n':
                    out += "[]\\[]";
                    break;
                case 'o':
                    out += "0";
                    break;
                case 'p':
                    out += "|D";
                    break;
                case 'q':
                    out += "(,)";
                    break;
                case 'r':
                    out += "|Z";
                    break;
                case 's':
                    out += "$";
                    break;
                case 't':
                    out += "']['";
                    break;
                case 'u':
                    out += "|_|";
                    break;
                case 'v':
                    out += "\\/";
                    break;
                case 'w':
                    out += "\\/\\/";
                    break;
                case 'x':
                    out += "}{";
                    break;
                case 'y':
                    out += "`/";
                    break;
                case 'z':
                    out += "2";
                    break;
                
            }
        }
        System.out.println(out);
    }
}