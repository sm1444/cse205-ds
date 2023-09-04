import java.util.Arrays;

public class P1539 {
    public int findKthPositive(int[] arr, int k) {
        int index = 0;
        int counter = 0;
        for(int i = 1;i<arr[arr.length-1];i++)
        {
            if(arr[index]==i)
            {
                index++;
            }else{
                counter++;
                if(counter==k) return i;
            }
        }
        Arrays.to
        return arr[arr.length-1]+k-counter;
    }
}
