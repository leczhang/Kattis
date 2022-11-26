import java.util.Scanner;
public class server{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int T = s.nextInt();
        int taskCounter = 0;
        for(int i=0;i<n;i++){
            int currTask = s.nextInt();
            if(T-currTask<0){
                break;
            }
            else{
                T = T-currTask;
                taskCounter++;
            }
        }
        System.out.println(taskCounter);
    }
}