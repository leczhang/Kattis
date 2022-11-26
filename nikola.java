import java.util.*;
public class nikola {
    static HashMap<String, Integer> memo;
    static int[] squares;
    static int n;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        squares = new int[n];
        memo = new HashMap<>();
        for(int i=0; i<n; i++){
            squares[i] = input.nextInt();
        }
        System.out.println(opt(0, 0));
    }

    static int opt(int square, int stepsize){

        if(square == n-1){
            return squares[n-1];
        }
        if(square < 0 || square > n-1){
            return 10000;
        }

        String key = "" + square + "," + stepsize;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int forward = opt(square+stepsize+1, stepsize+1);
        if(stepsize == 0){
            return forward;
        }
        int backward = opt(square-stepsize, stepsize);
        int bestOption = Math.min(forward, backward) + squares[square];
        memo.put(key, bestOption);
        return bestOption;
        
    }
}
