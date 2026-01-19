import java.util.Scanner;
public class Max {
    public static void main(String agr[]){

        Scanner st= new Scanner(System.in);
        System.out.print("Enter the size ");
        int n=st.nextInt();

        int arr[]=new int[n];
        int max=arr[0];
        for(int i=0; i<n; i++){
            arr[i]=st.nextInt();

        }
        for(int j=0; j<arr.length;j++){
            if (arr[j]>max) {
                max=arr[j];
                
            }
            
        }
        System.out.print(max +" ");
        st.close();
    }
    
    
}
