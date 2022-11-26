import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class goldbach2{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            int x = s.nextInt();
            int numRepresentations = 0;
            ArrayList<Integer> pairs = new ArrayList<>();
            //use Sieve of Eratosthenes
            boolean prime[] = new boolean[x+1];
            for (int j=0;j<=x;j++) prime[j] = true;
            for (int p=2;p*p<=x;p++) {
                if(prime[p] == true) {
                    for (int k=p*p;k<=x;k+=p) prime[k] = false;
                }
            }
            prime[0] = false;
            prime[1] = false;
            //System.out.println(Arrays.toString(prime));
            //check if j is prime, 
            //if so, check if x-j is prime
            //if so, numRepresentations++ and print j+(x-j)
            for(int j=2;j<x;j++){
                if(prime[j]){
                    if(prime[x-j]){
                        numRepresentations++;
                        prime[x-j] = false; //make sure we don't print a pair twice
                        pairs.add(j);
                        pairs.add(x-j);
                    }
                }
            }
            System.out.println(x+" has "+numRepresentations+" representation(s)");
            for(int j=0;j<numRepresentations;j++){
                System.out.println(pairs.get(j*2)+"+"+pairs.get(j*2+1));
            }
            System.out.println("");
        }
        s.close();
    }
}