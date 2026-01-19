import java.util.ArrayList;

public class ThirdLargeElement {
    public static void main(String arg[]){
        int arr[] ={21,43,25,65,76,34};
        int max=Integer.MIN_VALUE;
         int smax=Integer.MIN_VALUE;
         int thirdmax=Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdmax=smax;
                smax=max;
                max=arr[i];

            }
            else if(arr[i]>smax && arr[i] !=max){
                thirdmax=smax;
                smax=arr[i];

            }
            else if(arr[i]>thirdmax && arr[i]!=max && arr[i]!=smax){
                thirdmax=arr[i];
            }

         }
         System.out.println(max);
         System.out.println(smax);

         System.out.println(thirdmax);

         ArrayList<Integer> result=new ArrayList<>();
         result.add(max);
         result.add(smax);
         result.add(thirdmax);
         System.out.println(result);   
    }
    
}
