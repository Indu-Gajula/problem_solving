package org.example.designpatterns.creational.builder.basic;

public class Student {

    String name;
    String email;
    int age;
    String phoneNumber;

    public Student(Builder builder) throws Exception {
       if(builder.age < 18){
           throw new Exception("gae is < 18");
       }
       this.age = builder.age;
       this.name = builder.name;
       this.email = builder.email;

       this.phoneNumber = builder.phoneNumber;

    }


}
