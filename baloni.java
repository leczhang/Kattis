import java.util.*;

public class baloni{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] balloons = new int[1000001];
        
        for(int i=0; i<N; i++){
            int height = input.nextInt();
            if(balloons[height]!=0){
                balloons[height-1]++;
                balloons[height]--;
            }
            else{
                balloons[height-1]++;
            }
        }

        int arrows = 0;
        for(int i=0; i<1000001; i++){
            arrows+=balloons[i];
        }
        System.out.println(arrows);
    }
}