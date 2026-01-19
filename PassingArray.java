import java.util.Arrays;
public class PassingArray {
    public static void main(String[] args) {
        int arr[]={22,32,43,2,35};

        System.out.print(arr);
        change(arr);
        System.out.print(Arrays.toString(arr));

    }

    public static void change(int arr[]){
        arr[2]=11;

        System.out.print(arr);
    }

    



    
}
