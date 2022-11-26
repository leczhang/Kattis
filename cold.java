import java.util.Scanner;

public class cold{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numTemps = input.nextInt(), counter = 0;
        for(int i = 0; i < numTemps; i++){
            int temp = input.nextInt();
            if(temp < 0) counter++;
        }
        System.out.println(counter);
    }
}