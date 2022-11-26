import java.util.Scanner;
public class completingthesquare{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();
        s.close();
        int x4 = 0;
        int y4 = 0;
        double d1 = getDistance(x1, y1, x2, y2);
        double d2 = getDistance(x2, y2, x3, y3);
        double d3 = getDistance(x3, y3, x1, y1);
        double hypotenuse = Math.max(d1, Math.max(d2, d3));
        if(hypotenuse == d1){
            //System.out.println("d1 chosen. " + hypotenuse + d1 + d2 + d3);
            double center_x = (x1+x2)/2.0;
            double center_y = (y1+y2)/2.0;
            double delta_x = center_x - x3;
            double delta_y = center_y - y3;
            x4 = (int)(center_x + delta_x);
            y4 = (int)(center_y + delta_y);
        }
        else if(hypotenuse == d2){
            //System.out.println("d2 chosen. " + hypotenuse + d1 + d2 + d3);
            double center_x = (x2+x3)/2.0;
            double center_y = (y2+y3)/2.0;
            double delta_x = center_x - x1;
            double delta_y = center_y - y1;
            x4 = (int)(center_x + delta_x);
            y4 = (int)(center_y + delta_y);
        }
        else if(hypotenuse == d3){
            //System.out.println(x1 + " " + x3 + " " + y1 + " " + y3);
            //System.out.println("d3 chosen. " + hypotenuse + d1 + d2 + d3);
            double center_x = (x3+x1)/2.0;
            double center_y = (y3+y1)/2.0;
            double delta_x = center_x - x2;
            double delta_y = center_y - y2;
            //System.out.println(center_x + " " + center_y + " " + delta_x + " " + delta_y);
            x4 = (int)(center_x + delta_x);
            y4 = (int)(center_y + delta_y);
        }
        System.out.println(x4 + " " + y4);
    }
    private static double getDistance(int x1, int y1, int x2, int y2) {
        double delta_x = x1 - x2;
        double delta_y = y1 - y2;
        double dist = Math.sqrt(Math.pow(delta_x, 2) + Math.pow(delta_y, 2));
        return dist;
    }
}