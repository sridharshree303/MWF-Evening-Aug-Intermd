package accessmodifier;

public class Student2 extends Student1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.name = "";
        st1.age = 23;
        st1.email="";

        Student2 st2 = new Student2();
        st2.age = 34;
        st2.name = "";
        st2.email ="";
    }
}
