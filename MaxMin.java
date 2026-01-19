
public class MaxMin {

    public static void main (String agr[]){
        int arr[]={22,43,54,2,35,23};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println( "max value :"+max);
        System.out.println( "min value :"+min);


    }
    
}
