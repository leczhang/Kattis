import java.util.*;
public class plantingtrees{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] seedlings = new int[N];
        for(int i=0; i<N; i++){
            seedlings[i] = input.nextInt();
        }
        Arrays.sort(seedlings);
        int max = 1;
        int days = 1;
        for(int i=N-1; i>=0; i--){
            max--;
            if(seedlings[i] > max){
                max = seedlings[i];
            }
            days++;
        }
        System.out.println(days + max);
        
    }
}