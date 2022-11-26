import java.util.Scanner;
import java.util.Arrays;

public class register{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] register = new int[8];
        int[] explodedRegister = new int[] {1,2,4,6,10,12,16,18};
        int counter = 0;
        for(int i=0; i<8; i++){
            register[i] = input.nextInt();
        }
        boolean destroy = true;
        while(!Arrays.equals(register, explodedRegister))
        {
            counter++;
            register[0]++;
            if (register[0] == 2)
            {
                register[0] = 0;
                register[1]++;
            }
            if (register[1] == 3)
            {
                register[1] = 0;
                register[2]++;
            }
            if (register[2] == 5)
            {
                register[2] = 0;
                register[3]++;
            }
            if (register[3] == 7)
            {
                register[3] = 0;
                register[4]++;
            }
            if (register[4] == 11)
            {
                register[4] = 0;
                register[5]++;
            }
            if (register[5] == 13)
            {
                register[5] = 0;
                register[6]++;
            }
            if (register[6] == 17)
            {
                register[6] = 0;
                register[7]++;
            }
        }

        // while(destroy){
        //     if(Arrays.equals(register, explodedRegister)) destroy = false;
        //     else{
        //         int i = 0;
        //         while(true){
        //             if(register[i]<explodedRegister[i]){
        //                 register[i]++;
        //                 counter++;
        //             }
        //             else if(register[i]==explodedRegister[i]){
        //                 i++;
        //             }
        //         }
        //     }
        // }
        // while (destroy)
        // {
        //     // counter++;
        //     // if (register[0] == 0)
        //     // {
        //     //     register[0]++;
        //     // }
        //     // if (register[1] == 2)
        //     // {
        //     //     register[1] = 0;
        //     // }
        //     // if (register[2] == )
        //     int i = 0; 
        //     for (; i < 8; ++i)
        //     {
        //         if (register[i] < explodedRegister[i] - 1)
        //         {
        //             ++counter;
        //             i = -1;
        //         }
        //         else if (register[i] == explodedRegister[i] - 1)
        //         {
        //             if (i < 7 && register[i + 1] < explodedRegister[i + 1] - 1)
        //             {
        //                 ++register[i + 1];
        //                 register[i] = 0;
        //                 i = -1;
        //                 ++counter;
        //             }
        //         }
        //         else 
        //         {
        //             if (register.equals(explodedRegister)) 
        //             {
        //                 destroy = false;
        //                 break;
        //             }
        //         }
        //     }
        // }
        System.out.println(counter);
    }
}