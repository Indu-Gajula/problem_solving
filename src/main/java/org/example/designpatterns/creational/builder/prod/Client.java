package org.example.designpatterns.creational.builder.prod;

public class Client {
    public static void main(String[] args) throws Exception {
//        A.B ab = new A(). new B();
//
//        ab.b = "value";
//        System.out.println(ab.b);
//
//        A.C ac = new A.C();
//        ac.c = "somevalue";
//        System.out.println(ac.c);


        /*
        * 1. get rid of 2 classes and have a signle class
        * 2. make builder as a static inner class
        * 3. create a static method in Student (getBuilder), which returns object of builder --> to remove "new" Student.Builder()-- knws trhere is a inner class
        * 4. we changed the return type of setters to Builder // to achieve method chaining
        * 5. We will create build method in Builder
        * */



        // before the 3 step --- output for 1st and 2nd step
        Student.Builder sb = new Student.Builder();

        sb.setAge(20);
        sb.setEmail("abc@gmail.com");
        sb.setName("indu");
        sb.setPhoneNumber("+123");

   //     Student s = new Student(sb);  --> throws error as after the last step student constructor made private

        // after the 3 step
        Student.Builder sb1 =  Student.getBuilder();

        sb1.setAge(20);
        sb1.setEmail("abc@gmail.com");
        sb1.setName("indu");
        sb1.setPhoneNumber("+123");

  //      Student s1 = new Student(sb1);  --> throws error as after the last step student constructor made private




        // after 4th step
        Student.Builder sb2 = new Student.Builder()
                                            .setAge(20)
                                            .setEmail("abc@gmail.com")
                                            .setName("indu")
                                            .setPhoneNumber("+123");
    //    Student s2 = new Student(sb1);   --> throws error as after the last step student constructor made private

        //after 5th step
        Student s3 = Student.getBuilder()
                                    .setAge(20)
                                    .setEmail("abc@gmail.com")
                                    .setName("abhi")
                                    .setPhoneNumber("+123").build();

        System.out.println("builder pattern design is completed");







    }

}
class A {
    int a;
    class B {
        String b;
    }
    static class C{
        String c;
    }
}
