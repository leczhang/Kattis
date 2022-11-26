import java.util.Scanner;

public class quickestimate{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for(int i = 0; i < N; i++){
            String in = input.nextLine();
            System.out.println(in.length());
        }
    }
}