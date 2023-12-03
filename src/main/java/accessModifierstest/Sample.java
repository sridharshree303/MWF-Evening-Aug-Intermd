package accessModifierstest;


import accessmodifier.Student1;

public class Sample extends  Student1{
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.name = "sridhar"; //name - public
        //psp - private
        //age - protected
        //email - default
        Sample s1 = new Sample();
        s1.age = 20;
    }
}

class Sample2 extends Student1 {
    void test(){
        Student1 student1 = new Student1();
        student1.name = "ram";
        Sample2 s2 = new Sample2();
        s2.name = "sita";
        s2.age = 34;
    }
}


/**
 * protected variables can be accessible in same package and different package for child classes
 * protected variables can accessible with in package
 */