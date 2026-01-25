package Oops;

// Constructor are the special methods that has name as class name
// Constructor ek special method hota hai jo object create hote hi automatically call hota hai.

 class InnerConstructorEx {
    private int age;
    private String name;
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
       public InnerConstructorEx(){       //constructor.  default constructor
        name="Kunal Saini";
        age=21;
    }

       public InnerConstructorEx(int age, String name) {  // parameterized constructor
        this.age = age;
        this.name = name;
       }

    // two type of constructor
    // 1. Default constructor (no parameter)
    // 2. Parameterized constructor (with parameter)
    

    

    
}
public class ConstructorEx {
    public static void main(String args[]){
        InnerConstructorEx st= new InnerConstructorEx();
        // st.setName("Kunalsaini");
        // st.setAge(22);

        System.out.println(st.getName());
        System.out.println(st.getAge());
    }


    
}
