import java.util.Scanner;
import java.lang.Math;

public class closestsums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int caseCounter = 1;
        while(input.hasNextInt()){
            System.out.println("Case " + caseCounter + ":");
            caseCounter++;
            int n = input.nextInt();
            int[] set = new int[n];
            for(int i = 0; i < n; i++){
                set[i] = input.nextInt();
            }
            int m = input.nextInt();
            for(int i = 0; i < m; i++){
                int query = input.nextInt();
                int smallestDifference = Integer.MAX_VALUE;
                int closestSum = 0;
                for(int j = 0; j < n; j++){
                    for(int k = j+1; k < n; k++){
                        int difference = Math.abs((set[j]+set[k]) - query);
                        if(difference < smallestDifference){
                            smallestDifference = difference;
                            closestSum = set[j]+set[k];
                        }
                    }
                }
                System.out.println("Closest sum to " + query + " is " + closestSum + ".");
            }
        }
    }
}