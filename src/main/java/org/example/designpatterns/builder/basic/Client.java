package org.example.designpatterns.builder.basic;

import org.example.designpatterns.builder.basic.Builder;
import org.example.designpatterns.builder.basic.Student;

public class Client {
    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setAge(19);
        builder.setEmail("abc@gmail.com");
        builder.setName("indu");
        builder.setPhoneNumber("8909765464");
        Student student = new Student(builder);

        System.out.println("DEBUG");

    }
}
