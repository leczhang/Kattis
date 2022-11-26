import java.io.BufferedReader;
import java.io.InputStreamReader;
public class sortofsorting {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i=0; i<500; i++){
                String[] output = new String[0];
                    String line = reader.readLine();
                    int n = Integer.parseInt(line);
                    if(n == 0){
                        break;
                    }
                    output = new String[n+1];
                    for(int j=0; j<n; j++){
                        line =   reader.readLine();
                        output[j] = line + "\n";
                    }
                    output[n] = "\n";

                //sort

                for(int j=0; j<output.length-2; j++){
                    for(int k=0; k<output.length-j-2; k++){
                        String s1 = output[k];
                        String s2 = output[k+1];
                        //System.out.println("comparing " + s1 + s2);
                        char s1c1 = s1.charAt(0);
                        char s1c2 = s1.charAt(1);
                        char s2c1 = s2.charAt(0);
                        char s2c2 = s2.charAt(1);
                        if(s1c1 > s2c1){
                            output[k+1] = s1;
                            output[k] = s2;
                        }
                        else if(s1c1 == s2c1){
                            if(s1c2 > s2c2){
                                output[k+1] = s1;
                                output[k] = s2;
                            }
                        }
                    }
                }


                for(String str:output){
                    System.out.print(str);
                }
            }
            reader.close();
        }
        catch(Exception e){e.printStackTrace();}
    }
}
