import java.util.Scanner;

public class oddities{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for(int i = 0; i < lines; i++){
            int num = input.nextInt();
            if(num%2 == 0){
                System.out.println(num + " is even");
            }
            else{
                System.out.println(num + " is odd");
            }
        }
    }
}