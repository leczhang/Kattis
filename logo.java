import java.util.*;
public class logo{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0; i<testCases; i++){
            int numCommands = s.nextInt();
            double currPosX = 0;
            double currPosY = 0;
            int currDeg = 0;
            for(int j=0; j<numCommands; j++){
                String cmdType = s.next();

                int cmdMagnitude = s.nextInt();
                switch (cmdType) {
                    case "fd":
                        currPosX += Math.cos(currDeg*(Math.PI/180))*cmdMagnitude;
                        currPosY += Math.sin(currDeg*(Math.PI/180))*cmdMagnitude;
                        break;
                    case "bk":
                        currPosX -= Math.cos(currDeg*(Math.PI/180))*cmdMagnitude;
                        currPosY -= Math.sin(currDeg*(Math.PI/180))*cmdMagnitude;
                        break;
                    case "lt":
                        currDeg += cmdMagnitude;
                        break;
                    case "rt":
                        currDeg -= cmdMagnitude;
                        break;
                }
                //System.out.println("currPosX " + currPosX + " currPos Y " + currPosY);
            }
            System.out.println(Math.round(Math.sqrt(Math.pow(currPosX,2)+Math.pow(currPosY,2))));
        }
        s.close();
    }
}