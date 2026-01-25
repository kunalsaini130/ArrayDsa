// Encapsulation is the process of wrapping data and methods into a single unit and 
// protecting data using access modifiers
package Oops;

class Inner{
    private String name;
    private int age;


    public String getName() {        //Acces data by methods 
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}

public class EncapsulationTo {
    public static void main(String args[]){

        Inner st= new Inner();

        st.setName("KUNAL SAINI");
        st.setAge(22);

        System.out.println(st.getName());
        System.out.println(st.getAge());




    }


    
}
