import java.util.Scanner;

public class simonsays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for(int i = 0; i < N; i++){
            String in = input.nextLine();
            if(in.length() < 10){
                continue;
            }
            String simonsays = in.substring(0,10);
            //System.out.println(simonsays);
            if(simonsays.equals("Simon says")){
                System.out.println(in.substring(10,in.length()));
            }
        }
    }
}