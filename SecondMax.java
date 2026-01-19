import java.util.ArrayList;

public class SecondMax {

   public static  void main(String args[]){
    int arr[] ={21,43,25,65,76,34};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            smax=max;
            max=arr[i];
        }
        else if(arr[i]>smax && arr[i]!=max){
            smax=arr[i];

        } 
    }  
    
    System.out.println(max);
    System.out.println(smax);
    ArrayList<Integer> result=new ArrayList<>();
    result.add(max);
    result.add(smax);

    System.out.println(result);

   }
    
}
