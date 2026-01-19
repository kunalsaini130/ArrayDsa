 public class ArrayInde {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int x = 3;
        for(int i = 0; i < arr.length; i++)
        {
            
         if(arr[i] == x)
            {
                System.out.print("found index :" +i);
                break;
            }
        }
        
    
}

}