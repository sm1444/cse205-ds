//time complexity -->  O(2^n)
//start with small components and then jump to n components 

import java.util.*;

public class towerofhanoi
{
    static int count = 0;
    public static void method(int n , char start , char temp , char end)
    {
        //moving the last disc from start to end tower
        if(n==1){
            count++;
            System.out.println("Move disk from " + start + " to "+ end);
            return;
        }

        // moving n-1 disc from source to intermediate(temp)
        method(n-1,start,end,temp);       //check how the variable position changes 
        count++;

        // moving the n-1 disc from intermediate to the last tower(end)
        System.out.println("Move disk from "+ start + " to "+ end);
        method(n-1, temp , start , end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of disk: ");
        int num = sc.nextInt();
        float start_time = System.currentTimeMillis();
        method(num,'1','2','3');
        float end_time = System.currentTimeMillis();
        float total = end_time - start_time;
        System.out.println("Total steps invloved: "+count);
        System.out.println("Total time: "+total);
    }

}