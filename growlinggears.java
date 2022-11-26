import java.util.Scanner;
public class growlinggears{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            int n = s.nextInt();
            double maxTorque = 0;
            int gear = 0;
            for(int j=0;j<n;j++){
                double a = s.nextDouble();
                double b = s.nextDouble();
                double c = s.nextDouble();
                double vertex_x = b/(2.0*a);
                double vertex_y = -a*Math.pow(vertex_x, 2)+b*vertex_x+c;
                if(vertex_y>maxTorque){
                    maxTorque = vertex_y;
                    gear = j+1;
                }
            }
            System.out.println(gear);
        }
        s.close();
    }
}