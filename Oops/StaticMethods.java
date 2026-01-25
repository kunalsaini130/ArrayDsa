package Oops;
// Static method class ka hota hai, object ka nahi.
    // Object banaye bina call ho jata hai
    // class name se directly call karte hain
    // this keyword ka use karte hain static method me

public class StaticMethods {
    static void show(){
        System.out.println("Kunal saini");
    }

    public static void main(String[] args) {
        StaticMethods.show();

    }

    
    
}
