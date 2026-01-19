import java.util.Arrays;

public class ShallowArray {
    public static void main (String arg[]){
        int arr[] ={22,23,54,12,43};
        // int x[]=arr;
        // x[0]=100;
        // System.out.println(arr[0]);


        // for(int n:x){
            // System.out.print(n +" ");
        // }
                // Array  deep copy 
        int deep[]=Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(arr[0]);

    }
    
}
