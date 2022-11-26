import java.util.*;
public class numbertree{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] splitStr = line.split("\\s+");
        int H = Integer.parseInt(splitStr[0]);
        
        long root = (long)Math.pow(2, H+1) - 1;

        if(splitStr.length == 1){
            System.out.print(root);
            input.close();
            return;
        }
        String path = splitStr[1];

        long index = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'L'){
                index = 2*index + 1;
            }
            else if(path.charAt(i) == 'R'){
                index = 2*index + 2;
            }
        }
        System.out.print(root - index);

        input.close();
    }
}
