import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class threepowers{
    public static void main(String[]args){
        //idea: turn n-1 into binary -> 1=add 3^digit, 0=do nothing
        Scanner s = new Scanner(System.in);
        while(true){
            BigInteger n = new BigInteger(s.next());
            if(n.equals(BigInteger.ZERO)) break;
            n = n.subtract(BigInteger.ONE);
            ArrayList<BigInteger> set = new ArrayList<>();
            int digit = 0;
            while(n.compareTo(BigInteger.ZERO)>0){
                //System.out.println(n.toString());
                int binDigit = n.mod(BigInteger.TWO).intValue();
                n = n.divide(BigInteger.TWO);
                if(binDigit==1) set.add(new BigInteger("3").pow(digit));
                digit++;
            }
            System.out.print("{");
            for(int i=0; i<set.size(); i++){
                BigInteger b = set.get(i);
                System.out.print(" "+b.toString());
                if(i!=set.size()-1) System.out.print(",");
            }
            System.out.println(" }");
        }
        s.close();
    }
}