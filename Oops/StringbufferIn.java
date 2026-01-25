package Oops;

public class StringbufferIn {
    public static void main(String[] args) {

        StringBuffer st=new StringBuffer("kunal");
        // // String ke end me kuch jodne ke liye
        // st.append(" saini");

        // // Kisi index par string dalni ho
        // st.insert(0, "Developer ");

        // // Start index se end index tak delete
        // st.delete(0, 5);

        // // ek character remove
        // st.deleteCharAt(0);

    // when: palindrome / reverse problems
        st.reverse();


        System.out.print(st);
        
    }
    
}
