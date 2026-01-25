public class ReverseArray {
    public static void main(String args[]){
        int arr[]={21,43,2,54,65,78,35,};
        // int n=arr.length;
        // int i=0,j=n-1;
        // while (i<j) {
            // int temp=arr[i];
            // arr[i]=arr[j];
            // arr[j]=temp;
            // i++;
            // j--;
            // 
        // }


    //  using for loop 
    //  arr[i]= and arr[n-1-i]
    int n=arr.length;
    for(int i=0; i<n/2; i++){
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
    }

    for( int el:arr){
    System.out.println(el);
    }
    }

    
    
}
