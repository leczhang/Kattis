import java.util.Scanner;

public class periodicstrings{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        int k = 1;
        while(k < input.length()){
            if(input.length()%k != 0){
                k++;
                continue;
            }
            else{
                boolean kperiodic = true;
                String prevSubstr = null;
                for(int i=0; i<input.length()/k; i++){
                    if(prevSubstr == null){ //base case
                        prevSubstr = input.substring(0, k);
                        //System.out.println("iteration " + i + ": " + prevSubstr);
                    }
                    else{
                        String s1 = input.substring(k*i, k*i+k);
                        String s2 = s1.substring(1, s1.length());
                        s2 += s1.charAt(0);
                        //System.out.println("iteration " + i + ": " + prevSubstr);
                        //System.out.println("iteration " + i + ": " + s2);
                        if(prevSubstr.equals(s2)){
                            prevSubstr = s1;
                            continue;
                        }
                        else{
                            kperiodic = false;
                            break;
                        }
                    }
                }
                if(kperiodic){
                    break;
                }
                else{
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}