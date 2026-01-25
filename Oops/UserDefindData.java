package Oops;

public class UserDefindData {

    //  user defind data type 
    public static class sub {
        int rollNo;
        String name;
        String city;
    
        
    }
    public static void main(String arg[]){
        sub st= new sub();
        st.name=("kunal");
        st.city="shamli";
        st.rollNo=35;


        System.out.print(st.name+"  "+ st.rollNo+ " "+ st.city );


    }
    
}
